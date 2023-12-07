package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Procesos.*;
import Vista.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class ControladorAyuda implements ActionListener {
    private String enlace1 = "https://drive.google.com/drive/folders/1xKXxc7Vmk3KriwtGdQeHWe9UQM6vV1RS?usp=sharing";
    private String enlaceReu = "https://us05web.zoom.us/j/98775413904?pwd=M1o5dnMyL2ZjbCsxUlpwZ2JQT2FxUT09";
    private String enlaceT1 = "https://drive.google.com/drive/folders/1e8JdVUZfJyAuR0T3nfLdGnNQEncVu_B7?usp=sharing";
    JIFAyuda a;
    
    public ControladorAyuda(JIFAyuda fa) {
        a = fa;
        a.btnPDF.addActionListener(this);
        a.btnVideo.addActionListener(this);
        a.btnZoom.addActionListener(this);
        ProcesosFrmIAyuda.PresentacionAyuda(fa);
        ActualizarForma();
    }
    
    void ActualizarForma() {
        ProcesosFrmIAyuda.Estado(a);
    }
    
    private void abrirEnlace(String enlace){
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop,getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI(enlace);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }

       @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a.btnPDF) {
            abrirEnlace(enlace1);
        }
        
        if (e.getSource() == a.btnVideo) {
            abrirEnlace(enlaceT1);
        }
        
        if (e.getSource() == a.btnZoom) {
            abrirEnlace(enlaceReu);
        }
    }
}
