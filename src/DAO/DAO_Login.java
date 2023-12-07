package DAO;
import Formatos.Mensajes;
import Modelo.Usuario;

public class DAO_Login extends ConectarBD{
    private ConectarBD conectarBD;

    public DAO_Login() {
        this.conectarBD = new ConectarBD();
    }

    public boolean verificarCredenciales(Usuario usu) {
        try {
            rs = conectarBD.st.executeQuery("select usuario, contrasena from usuarios;");
            boolean usuarioEncontrado = false;

            while (rs.next()) {
                String usuarioBD = rs.getString("usuario");
                String contraseñaBD = rs.getString("contrasena");

                if (usu.getUsuario().equals(usuarioBD) && usu.getContraseña().equals(contraseñaBD)) {
                    usuarioEncontrado = true;
                    break;
                }
            }
            rs.close();
            conectarBD.conexion.close();
            return usuarioEncontrado;
        } catch (Exception e) {
            Mensajes.M1("Error de Inicio: " + e);
            return false;
        }
    }
}