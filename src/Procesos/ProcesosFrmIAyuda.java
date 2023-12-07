package Procesos;
import Vista.JIFAyuda;
import java.awt.Dimension;

public class ProcesosFrmIAyuda {
    public static void PresentacionAyuda(JIFAyuda fa) {
        fa.setTitle("SECCION DE AYUDA");
        fa.setVisible(true);
        fa.setSize(new Dimension(848, 533));
    }
    
    public static void Estado(JIFAyuda fa) {
        fa.btnPDF.setEnabled(true);
        fa.btnVideo.setEnabled(true);
        fa.btnZoom.setEnabled(true);
    }
}