package DAO;
import Formatos.*;
import Modelo.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO_Matricula extends ConectarBD{
    public DAO_Matricula() {}
    
    public List<Tabla> MostrarMatriculasRealizado(Alumno al) {
        List<Tabla> matriculaPendientes = new ArrayList<>();
        try {
            String query = "select d.indicador, d.iddatos, d.descrip, d.fini, d.ffin, d.monto, a.codest, a.dni, a.nombre, a.genero, a.grado, a.seccion, a.fecha "
                    + "FROM tb_datos d "
                    + "INNER JOIN tb_alumno a ON d.codest_fk = a.codest "
                    + "WHERE a.codest = " + al.getCodAlm() + " AND d.indicador = 'N';";

            rs = st.executeQuery(query);

            while (rs.next()) {
                Tabla tb = new Tabla();
                tb.setIndicador(rs.getString(1));
                tb.setCodAlm(rs.getInt(2));
                tb.setDNI(rs.getInt(3));
                tb.setNombre(rs.getString(4));
                tb.setGenero(rs.getString(5));
                tb.setGrd(rs.getString(6));
                tb.setSec(rs.getString(7));
                tb.setFecha(rs.getDate(8));
                matriculaPendientes.add(tb);
            }
            conexion.close();
            return matriculaPendientes;
        } catch (SQLException ex) {
            Mensajes.M1("Error al mostrar los datos de matricula pendientes: " + ex);
            return null;
        }
    }
    
    public void MostrarMatricula(JTable tabla) {
        String[] titulos = {"Nro","Cod Est","DNI","Alumno","Genero","Grado","Seccion","Fecha"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        ManejadorTablas.FormatoTablaMatricula(tabla);
        Alumno al = new Alumno();
        int cantal = 0;
        try {
            rs = st.executeQuery("select codest,dni,nombre,genero,grado,seccion,fecha,indicador" + " from tb_alumno where indicador='S';");
            while (rs.next()) {
                cantal++;
                al.setCodAlm(rs.getInt(1));
                al.setDNI(rs.getInt(2));
                al.setNombre(rs.getString(3));
                al.setGenero(rs.getString(4));
                al.setGrd(rs.getString(5));
                al.setSec(rs.getString(6));
                al.setFecha(rs.getDate(7));
                al.setIndicador(rs.getString(8));
                modelo.addRow(al.RegistrarMatricula(cantal));
            }
            ManejadorTablas.FormatoTablaPago(tabla);
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("Error no se pueden mostrar los datos matricula: " + e);
        }
    }
    
    //INSERTAR ALUMNO
    public void InsertarMatricula(Alumno al) {
        try {
            ps = conexion.prepareStatement("insert into tb_alumno(codest, dni, nombre, genero, grado, seccion, fecha, indicador) values(?,?,?,?,?,?,?, 'S');");
            ps.setInt(1, al.getCodAlm());
            ps.setInt(2, al.getDNI());         
            ps.setString(3, al.getNombre());
            ps.setString(4, al.getGenero());
            ps.setString(5, al.getGrd());
            ps.setString(6, al.getSec());            
            java.sql.Date sqlDate = new java.sql.Date(al.getFecha().getTime());
            ps.setDate(7, sqlDate);
            ps.executeUpdate();
            Mensajes.M1("Datos insertados correctamente...");
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("Error no se puede insertar matricula: " + e);
        }
    }
}