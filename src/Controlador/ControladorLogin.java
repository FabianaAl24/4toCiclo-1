package Controlador;
import DAO.DAO_Login;
import Modelo.*;
import Procesos.ProcesosLogin;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {
    Login vista;
    DAO_Login crl;
    private int fallas = 0;
    private final int intentos = 3;

    public ControladorLogin(Login forma) {
        vista = forma;
        vista.btnIniciar.addActionListener(this);
        ProcesosLogin.IniciarForma(vista);
        ActualizarForma();

        vista.txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        vista.psPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                psPassMouseClicked(evt);
            }
        });
    }
    
    void ActualizarForma() {
        crl = new DAO_Login();
        ProcesosLogin.Estado1(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIniciar) {
            Usuario us = new Usuario();
            us.setUsuario(vista.txtUsuario.getText());
            us.setContraseña(String.valueOf(vista.psPass.getPassword()));
            
            DAO_Login daoLogin = new DAO_Login(); 
            if (daoLogin.verificarCredenciales(us)) {
                Menu menu = new Menu();
                menu.setVisible(true);
                vista.dispose();
            } else {
                fallas++;
                if (fallas >= intentos) {
                    JOptionPane.showMessageDialog(vista, "Supero el max. intentos fallidos. (Bloqueado)");
                    ProcesosLogin.Estado2(vista);
                } else {
                    JOptionPane.showMessageDialog(vista, "Intento fallido " + intentos + " de " + fallas);
                }
            }
        }
    }

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt){
        if(vista.txtUsuario.getText().equals("Ingrese su nombre de usuario")){
           vista.txtUsuario.setText("");
           vista.txtUsuario.setForeground(Color.white);
        }
        if (String.valueOf(vista.psPass.getPassword()).isEmpty()) {
            vista.psPass.setText("********");
            vista.psPass.setForeground(Color.gray);
        }
    }    
    private void psPassMouseClicked(java.awt.event.MouseEvent evt) {
        if(String.valueOf(vista.psPass.getPassword()).equals("********")){
           vista.psPass.setText("");
           vista.psPass.setForeground(Color.white);
        }
        if (vista.txtUsuario.getText().isEmpty()) {
            vista.txtUsuario.setText("Ingrese su nombre de usuario");
            vista.txtUsuario.setForeground(Color.gray);
        }
    }
}