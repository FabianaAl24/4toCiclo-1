package DAO;
import Formatos.*;
import Modelo.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_Pago extends ConectarBD{
    public DAO_Pago() {}
    
    public List<Tabla> MostrarPago(Alumno alumno) {
        List<Tabla> pagosPendiente = new ArrayList<>();
        try {
            rs = st.executeQuery("select indicador,iddatos, descrip, fini, ffin, monto, codest_fk from tb_datos where codest_fk = " + alumno.getCodAlm() + " and indicador='S';");
            while (rs.next()) {
                Tabla tb = new Tabla();
                tb.setIndicador(rs.getString(1));
                tb.setId(rs.getInt(2));
                tb.setDesc(rs.getString(3));
                tb.setFini(rs.getDate(4));
                tb.setFfin(rs.getDate(5));
                tb.setMonto(rs.getFloat(6));

                tb.setCodAlm(alumno.getCodAlm());
                pagosPendiente.add(tb);
            }
            conexion.close();
            return pagosPendiente;
        } catch (SQLException ex) {
            Mensajes.M1("Error no se pueden mostrar los datos pagos: " + ex);
            return null;
        }
    }

    public List<Tabla> MostrarPagoRealizado(Alumno alumno) {
        List<Tabla> pagosPendientes = new ArrayList<>();
        try {
            String query = "SELECT d.indicador, d.iddatos, d.descrip, d.fini, d.ffin, d.monto, a.codest, a.dni, a.nombre, a.genero, a.grado, a.seccion, a.fecha "
                    + "FROM tb_datos d "
                    + "INNER JOIN tb_alumno a ON d.codest_fk = a.codest "
                    + "WHERE a.codest = " + alumno.getCodAlm() + " AND d.indicador = 'N';";

            rs = st.executeQuery(query);

            while (rs.next()) {
                Tabla tb = new Tabla();
                tb.setIndicador(rs.getString(1));
                tb.setId(rs.getInt(2));
                tb.setDesc(rs.getString(3));
                tb.setFini(rs.getDate(4));
                tb.setFfin(rs.getDate(5));
                tb.setMonto(rs.getFloat(6));
                tb.setCodAlm(rs.getInt(7));
                tb.setCodAlm(rs.getInt(7));
                tb.setNombre(rs.getString(9));
                tb.setGenero(rs.getString(10));
                tb.setGrd(rs.getString(11));
                tb.setSec(rs.getString(12));
                tb.setFecha(rs.getDate(13));
                pagosPendientes.add(tb);
            }
            conexion.close();
            return pagosPendientes;
        } catch (SQLException ex) {
            Mensajes.M1("Error al mostrar los datos de pagos pendientes: " + ex);
            return null;
        }
    }

    //CONSULTA DATOS PAGO(ID)
    public Alumno ConsultarAlumno(int idal) {
        Alumno al = null;
        try {
            rs = st.executeQuery("select codest,dni,nombre,genero,grado,seccion,fecha," + "indicador from tb_alumno where indicador='S' and codest=" + idal + ";");
            if (rs.next()) {
                al = new Alumno();
                al.setCodAlm(rs.getInt(1));
                al.setDNI(rs.getInt(2));
                al.setNombre(rs.getString(3));
                al.setGenero(rs.getString(4));
                al.setGrd(rs.getString(5));
                al.setSec(rs.getString(6));
                al.setFecha(rs.getDate(7));
                al.setIndicador(rs.getString(8));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("Error no se puede consultar el registro: " + e);
        }
        return al;
    }

    //ACTUALIZAR PAGO
    public void InsertarPago(Pago pago) {
        try {
            ps = conexion.prepareStatement("UPDATE tb_datos SET indicador='N' WHERE iddatos = ? ;");
            ps.setInt(1, pago.getIdPago());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException e) {
            Mensajes.M1("Error no se pudo registrar el pago. Intentelo nuevamente: " + e);
        }
    }
}