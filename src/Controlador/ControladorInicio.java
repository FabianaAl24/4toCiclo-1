package Controlador;
import Procesos.ProcesosFrmIInicio;
import Vista.JIFInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInicio implements ActionListener{
    JIFInicio ini;
    
    public ControladorInicio(JIFInicio fini) {
        ini = fini;
        ProcesosFrmIInicio.PresentacionInicio(fini);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {}
}