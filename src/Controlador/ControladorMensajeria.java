package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Procesos.*;
import Modelo.*;
import Vista.*;
import conexion.Conector;

public class ControladorMensajeria implements ActionListener {
    JIFMensajeria m;
    Messenger crm;
    Conector pm;
    
    public ControladorMensajeria(JIFMensajeria fme) {
        m = fme;
        fme.btnConectar.addActionListener(this);
        fme.btnEnviar.addActionListener(this);
        ProcesosFrmIMensaje.PresentacionMensaje(fme);
        ActualizarForma();
    }

    void ActualizarForma() {
        ProcesosFrmIMensaje.Estado(m);
        ProcesosFrmIMensaje.LimpiarEntradas(m);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == m.btnConectar) {
            crm.iniciarcliente(this.m.txtIp.getText());
        }
        
        if (e.getSource() == m.btnEnviar) {
            crm.Cliente.enviarMSG(m.txtNombre.getText() + " Dice: " + m.txtMensaje.getText());
            m.txaHistorial.setText(m.txaHistorial.getText() + "\n" + 
                                   m.txtNombre.getText() + " Dice: " + m.txtMensaje.getText());
            ProcesosFrmIMensaje.LimpiarEntradas(m);
        }
    }
}