package Controlador;

import DAO.CuotaMatriculaDAO;
import DAO.EstudianteDAO;
import DAO.PagoCuotaMatriculaDAO;
import DAO.PagoDAO;
import Modelo.CuotaMatricula;
import Modelo.Estudiante;
import Modelo.Pago;
import Modelo.PagoCuotaMatricula;
import Procesos.ProcesosPago;
import Vista.JIFPago;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ControladorPago implements ActionListener {

    JIFPago jIFPago;
    private static EstudianteDAO estudianteDAO = new EstudianteDAO();
    private static CuotaMatriculaDAO cuotaMatriculaDAO = new CuotaMatriculaDAO();
    private static PagoCuotaMatriculaDAO pagoCuotaMatriculaDAO = new PagoCuotaMatriculaDAO();
    private static PagoDAO pagoDAO = new PagoDAO();

    public ControladorPago(JIFPago forma) {
        jIFPago = forma;
        jIFPago.btnBuscar.addActionListener(this);
        jIFPago.btnPago.addActionListener(this);
        jIFPago.btnImprimir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jIFPago.btnBuscar) {
            mostrar();
        } else if (e.getSource() == jIFPago.btnPago) {
            if (Seleccionados(0)) {
                Double montoTotal = Double.valueOf(jIFPago.txtTotal.getText());
                Pago pago = new Pago();
                pago.setFechaPago(new Date());
                pago.setMonto(montoTotal);
                pagoDAO.crearPago(pago);
                System.out.println("id pago : " + pago.getIdPago());

                for (int i = 0; i < jIFPago.tbDatos.getRowCount(); i++) {
                    boolean sel = (boolean) jIFPago.tbDatos.getValueAt(i, 0);
                    if (sel) {
                        int idCuota = (int) jIFPago.tbDatos.getValueAt(i, 1);
                        CuotaMatricula cuota = cuotaMatriculaDAO.obtenerCuotaMatriculaPorId(idCuota);
                        System.out.println("Cliente : " + cuota.getDescripcion());

                        PagoCuotaMatricula pagoCM = new PagoCuotaMatricula();
                        pagoCM.setCuotaMatricula(cuota);
                        pagoCM.setPago(pago);

                        pagoCuotaMatriculaDAO.crearPagoCuotaMatricula(pagoCM);
                    }
                }
            }
            mostrar();
            jIFPago.txtTotal.setText("");
            JOptionPane.showMessageDialog(null, "¡Pago registrado correctamente!", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == jIFPago.btnImprimir) {
            Estudiante estudiante = ProcesosPago.LeerEstudiante(jIFPago);

            estudiante = estudianteDAO.obtenerEstudiantePorCodigo(estudiante.getCodigoEstudiante());
            List<PagoCuotaMatricula> pagosCuotaMatricula = pagoCuotaMatriculaDAO.buscarPorCodigoEstudiante(estudiante.getCodigoEstudiante());

            LinkedHashSet<String> codigosPago = new LinkedHashSet<>();

            for (PagoCuotaMatricula pag : pagosCuotaMatricula) {
                codigosPago.add(pag.getPago().getIdPago());
            }
            String[] selectionValues = codigosPago.toArray(new String[0]);

            JDialog.setDefaultLookAndFeelDecorated(true);
            String initialSelection = selectionValues.length > 0 ? selectionValues[0] : null;
            String selection = (String) JOptionPane.showInputDialog(null,
                    "Selecciona el pago del cual requieres generar la boleta:",
                    "Reporte de pagos",
                    JOptionPane.QUESTION_MESSAGE, null,
                    selectionValues, initialSelection);

            if (selection != null) {
                System.out.println("Seleccionaste el pago con el código: " + selection);
                pagoCuotaMatriculaDAO.generarReporteEstudiante(estudiante, pagosCuotaMatricula, selection);
            }

        }
    }

    private void mostrar() {
        Estudiante estudiante = ProcesosPago.LeerEstudiante(jIFPago);

        estudiante = estudianteDAO.obtenerEstudiantePorCodigo(estudiante.getCodigoEstudiante());
        if (estudiante == null) {
            return;
        }
        jIFPago.txtEstudiante.setText(estudiante.getNombre() + " " + estudiante.getApellido());
        jIFPago.cbxSeccion.setSelectedItem(estudiante.getSeccion());
        jIFPago.cbxGrado.setSelectedItem(estudiante.getGrado());

        List<CuotaMatricula> cuotas = cuotaMatriculaDAO.obtenerCuotasPendientesPorEstudiante(estudiante);
        jIFPago.modelP.setRowCount(0);
        for (CuotaMatricula c : cuotas) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicio = formato.format(c.getFechaInicio());
            String fechaFin = formato.format(c.getFechaLimite());
            Object datas[] = {false, c.getIdCuota(), c.getDescripcion(), fechaInicio, fechaFin, c.getMonto(), c.getIdCuota()};
            jIFPago.modelP.addRow(datas);
        }
    }

    private boolean Seleccionados(int pos) {
        int contador = 0;
        boolean bandera = true;
        for (int i = 0; i < jIFPago.modelP.getRowCount(); i++) {
            boolean seleccion = (boolean) jIFPago.modelP.getValueAt(i, pos);
            if (seleccion) {
                contador++;
            }
        }
        if (contador == 0) {
            bandera = false;
        }
        return bandera;
    }
}
