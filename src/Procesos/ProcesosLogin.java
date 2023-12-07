package Procesos;
import Vista.*;
import Modelo.*;

public class ProcesosLogin {
    public static void IniciarForma(Login f1){
        f1.setTitle("LOGIN");
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
    }
    
    public static void Estado1(Login fl) {
        fl.btnIniciar.setEnabled(true);
    }
    
    public static void Estado2(Login fl) {
        fl.btnIniciar.setEnabled(false);
    }
    
    public static Usuario LeerUser(Login f1){
        Usuario us = new Usuario();
        us.setUsuario(f1.txtUsuario.getText());
        us.setContraseña(String.valueOf(f1.psPass.getPassword()));
        return us;
    }
}