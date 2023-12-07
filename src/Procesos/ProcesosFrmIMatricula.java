package Procesos;
import Modelo.Alumno;
import Vista.JIFMatricula;
import java.awt.Dimension;

public class ProcesosFrmIMatricula {
    public static void PresentacionPagos(JIFMatricula fma) {
        fma.setTitle("REGISTRO MATRICULA...");
        fma.setVisible(true);
        fma.setSize(new Dimension(848, 533));
    }
    
    public static void Estado1(JIFMatricula fma) {
        fma.btnRegistrar.setEnabled(true);
        fma.btnImprimir.setEnabled(false);
    }
    
    public static void Estado2(JIFMatricula fma) {
        fma.btnRegistrar.setEnabled(true);
        fma.btnImprimir.setEnabled(true);
    }
    
    public static void LimpiarEntradas(JIFMatricula fma) {
        fma.txtCodAlumno.setText("");
        fma.txtAlumno.setText("");
        fma.txtDNI.setText("");
        fma.dcFecha.setDate(null);
        fma.cbxGrado.setSelectedIndex(0);
        fma.cbxSeccion.setSelectedIndex(0);
        fma.cbxGenero.setSelectedIndex(0);
        fma.txtCodAlumno.requestFocus();
    }

    public static Alumno LeerMatricula(JIFMatricula fma) {
        Alumno al = new Alumno();
        al.setNombre(fma.txtAlumno.getText());
        al.setDNI(Integer.parseInt(fma.txtDNI.getText()));
        al.setGenero(fma.cbxGenero.getSelectedItem().toString());
        al.setGrd(fma.cbxGrado.getSelectedItem().toString());
        al.setSec(fma.cbxSeccion.getSelectedItem().toString());
        al.setFecha(fma.dcFecha.getDate());
        al.setCodAlm(Integer.parseInt(fma.txtCodAlumno.getText()));
        return al;
    }
}