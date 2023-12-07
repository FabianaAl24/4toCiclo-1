package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Procesos.*;
import Modelo.*;
import Vista.*;
import DAO.*;
import Util.ReporteItext_1;
import java.util.ArrayList;
import java.util.List;

public class ControladorMatricula implements ActionListener {
    JIFMatricula ma;
    DAO_Matricula crma;
    Alumno al;
    
    public ControladorMatricula(JIFMatricula fma) {
        ma = fma;
        ma.btnRegistrar.addActionListener(this);
        ma.btnImprimir.addActionListener(this);
        ProcesosFrmIMatricula.PresentacionPagos(fma);
        ActualizarForma();
    }
    
    void ActualizarForma() {
        crma = new DAO_Matricula();
        crma.MostrarMatricula(ma.tbDatos);
        ProcesosFrmIMatricula.Estado1(ma);
        ProcesosFrmIMatricula.Estado2(ma);
        ProcesosFrmIMatricula.LimpiarEntradas(ma);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ma.btnRegistrar) {
            
        }
        
        if (e.getSource() == ma.btnImprimir) {
            List<Tabla> matriculasRealizadas = new ArrayList<>();
            crma = new DAO_Matricula();
            matriculasRealizadas = crma.MostrarMatriculasRealizado(al);
            
            if (matriculasRealizadas != null) {
                ReporteItext_1.generarReporteEstudiante(matriculasRealizadas);
            }
        }
    }
}