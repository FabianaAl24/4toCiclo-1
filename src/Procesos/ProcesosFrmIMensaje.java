package Procesos;
import Vista.*;
import java.awt.Dimension;

public class ProcesosFrmIMensaje {
    public static void PresentacionMensaje(JIFMensajeria fme) {
        fme.setTitle("SECCION MENSAJERIA");
        fme.setVisible(true);
        fme.setSize(new Dimension(848, 533));
    }
    
    public static void Estado(JIFMensajeria fme) {
        fme.btnConectar.setEnabled(true);
        fme.btnEnviar.setEnabled(true);
    }
    
    public static void LimpiarEntradas(JIFMensajeria fme) {
        //DATOS MENSAJE
        fme.txtMensaje.setText("");
        fme.txtMensaje.requestFocus();
    }
}