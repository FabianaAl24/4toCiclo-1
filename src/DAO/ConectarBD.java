package DAO;
import java.sql.*;
import Formatos.*;

public class ConectarBD implements Parametros {
    public Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    
    public ConectarBD() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st = conexion.createStatement();
        } catch (Exception e) {
            Mensajes.M1("Error no se puede conectar a la Base de Datos: " + e);
        }
    }
}