package Controlador;
import Modelo.*;
import Procesos.ProcesosLogin;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {
    Login vista;
    private int fallas = 0;
    private final int intentos = 3;

    public ControladorLogin(Login forma) {
        vista = forma;
        vista.btnIniciar.addActionListener(this);
        ProcesosLogin.IniciarForma(vista);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIniciar && !vista.btnIniciar.isEnabled()) {return;}
        if (e.getSource() == vista.btnIniciar) {
            Usuario us = new Usuario();
            String user = vista.txtUsuario.getText();
            String pass = String.valueOf(vista.psPass.getPassword());           
            if (user.equals("grupo") && pass.equals("12345678")) {
                Menu menu = new Menu();
                menu.setVisible(true);
                vista.dispose();
            } else {
                fallas++;
                if (fallas >= intentos) {
                    JOptionPane.showMessageDialog(vista, "Supero el max. intentos fallidos. (Bloqueado)");
                    vista.btnIniciar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(vista, "Intento fallido " + intentos + " de " + fallas);
                }
            }
        }
    }

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt){
        if(vista.txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            vista.txtUsuario.setText("");
            vista.txtUsuario.setForeground(Color.white);
        }

        if(String.valueOf(vista.psPass.getPassword()).isEmpty()) {
            vista.psPass.setText("****");
            vista.psPass.setForeground(Color.gray);
        }
    }   
    
    private void psPassMouseClicked(java.awt.event.MouseEvent evt) {
        if(String.valueOf(vista.psPass.getPassword()).equals("****")) {
            vista.psPass.setText("");
            vista.psPass.setForeground(Color.white);
        }
        
        if(vista.txtUsuario.getText().isEmpty()) {
            vista.txtUsuario.setTexto("Ingrese su nombre de usuario");
            vista.txtUsuario.setForeground(Color.gray);
        }
    }
}
