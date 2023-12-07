package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Procesos.*;
import Formatos.*;
import Modelo.*;
import Vista.*;
import DAO.*;
import Util.ReporteItext;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorPagos implements ActionListener, MouseListener {
    JIFPago p;
    DAO_Pago crp;
    Pago pa;
    Alumno al;
    Tabla tb;

    String columnas[] = {"", "id", "Descripcion", "Fecha de Inicio", "Fecha de Vencimiento", "Monto"};
    boolean ColumnasEditables[] = {true, false, false, false, false, false};
    Class tipo[] = new Class[]{java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class};
    
    public DefaultTableModel modelP = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            return ColumnasEditables[col];
        }

        public Class getColumnClass(int index) {
            return tipo[index];
        }
    };

    public ControladorPagos(JIFPago fp) {
        p = fp;
        p.btnBuscar.addActionListener(this);
        p.btnPago.addActionListener(this);
        p.btnImprimir.addActionListener(this);
        p.tbDatos.addMouseListener(this);
        ProcesosFrmIPagos.PresentacionPagos(fp);
        ActualizarForma();
        modelP.setColumnIdentifiers(columnas);
        p.tbDatos.setModel(modelP);

    }

    void ActualizarForma() {
        crp = new DAO_Pago();
        ProcesosFrmIPagos.Estado1(p);
        ProcesosFrmIPagos.Estado2(p);
    }

    private boolean Seleccionados(int pos) {
        int contador = 0;
        boolean bandera = true;
        for (int i = 0; i < p.tbDatos.getRowCount(); i++) {
            boolean seleccion = (boolean) JIFPago.tbDatos.getValueAt(i, pos);
            if (seleccion) {
                contador++;
            }
        }
        if (contador == 0) {
            bandera = false;
        }
        return bandera;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == p.btnBuscar) {
            int idP = Mensajes.M2("Ingrese el ID del Alumno a buscar...");
            al = (Alumno) crp.ConsultarAlumno(idP);
            if (Objects.isNull(al)) {
                Mensajes.M1("El id " + idP + " no existe en la tabla Alumno...");
            } else {
                p.txtCodEst.setText(Integer.toString(al.getCodAlm()));
                p.txtEstudiante.setText(al.getNombre());
                p.cbxGrado.setSelectedItem(al.getGrd());
                p.cbxSeccion.setSelectedItem(al.getSec());
                ProcesosFrmIPagos.Estado2(p);
                crp = new DAO_Pago();
                MostrarPago(al);
            }
        }
        if (e.getSource() == p.btnPago) {
            boolean camposLlenos = true;
            
            for (int i = 0; i < p.tbDatos.getRowCount(); i++) {
                boolean sel = (boolean) p.tbDatos.getValueAt(i, 0);
                
                if (sel) {
                    if (p.cbxFormPago.getSelectedItem().equals("Banca movil") && p.cbxFormPago.getSelectedItem().equals("Efectivo") || p.txtNTarjeta.getText().isEmpty() || p.txtMMAA.getText().isEmpty() || p.txtCVV.getText().isEmpty()) {
                        camposLlenos = false;
                        break;
                    }
                    int idCuota = (int) p.tbDatos.getValueAt(i, 1);
                    Pago pago = new Pago();
                    pago.setIdPago(idCuota);
                    crp = new DAO_Pago();
                    crp.InsertarPago(pago);
                }
            }
            if (camposLlenos) {
                MostrarPago(al);
                Mensajes.M1("Se realizo el pago correctamente...");
            } else {
                Mensajes.M1("Llenar los campos faltantes...");
            }
        }

        if (e.getSource() == p.btnImprimir) {
            if (Objects.nonNull(al)) {
                List<Tabla> pagosRealizados = new ArrayList<>();
                crp = new DAO_Pago();
                pagosRealizados = crp.MostrarPagoRealizado(al);
                
                if(pagosRealizados != null){
                    ReporteItext.generarReporteEstudiante(pagosRealizados);
                }
            }
        }
    }

    private void MostrarPago(Alumno al) {
        if (Objects.nonNull(al)) {
            List<Tabla> pagosPendiente = new ArrayList<>();
            crp = new DAO_Pago();
            pagosPendiente = crp.MostrarPago(al);
            if (pagosPendiente == null) {
                return;
            }
            modelP.setRowCount(0);
            for (Tabla c : pagosPendiente) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(c.getFini());
                String fechaFin = formato.format(c.getFfin());
                Object datas[] = {false, c.getId(), c.getDesc(), fechaInicio, fechaFin, c.getMonto(), c.getId()};
                modelP.addRow(datas);
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() instanceof JTable) {
            Double total = 0d;
            if (Seleccionados(0)) {
                for (int i = 0; i < p.tbDatos.getRowCount(); i++) {
                    boolean sel = (boolean) p.tbDatos.getValueAt(i, 0);
                    Float monto = (Float) p.tbDatos.getValueAt(i, 5);
                    if (sel) {
                        total = total + monto;
                    }
                }
            }
            p.txtTotal.setText(String.valueOf(total));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}