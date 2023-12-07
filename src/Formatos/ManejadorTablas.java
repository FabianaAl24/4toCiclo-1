package Formatos;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class ManejadorTablas {
    public static void AnchoColumnas(JTable t, int numcolumna, int ancho) {
        TableColumn column;
        column = t.getColumnModel().getColumn(numcolumna);
        column.setPreferredWidth(ancho);
    }
    
    public static void JustificarCelda(JTable t, int numcolumna) {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        t.getColumnModel().getColumn(numcolumna).setCellRenderer(modelocentrar);
    }
    
    //TABLA MATRICULA
    public static void FormatoTablaMatricula(JTable tabla) {
        AnchoColumnas(tabla, 0, 40);//CODIGO ALUMNO (pk)
        AnchoColumnas(tabla, 1, 40);//DNI
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 100);//ALUMNO
        AnchoColumnas(tabla, 3, 50);//GENERO
        AnchoColumnas(tabla, 4, 50);//GRADO
        AnchoColumnas(tabla, 5, 30);//SECCION
        JustificarCelda(tabla, 5);
        AnchoColumnas(tabla, 6, 80);//FECHA
        JustificarCelda(tabla, 6);
    }
    
    //TABLA PAGOS
    public static void FormatoTablaPago(JTable tabla) {
        AnchoColumnas(tabla, 0, 30);//ID(pk)
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);//DESCRIPCION
        AnchoColumnas(tabla, 2, 100);//FECHA DE INICIO
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 100);//FECHA DE FIN
        JustificarCelda(tabla, 3);
        AnchoColumnas(tabla, 4, 80);//MONTO
        JustificarCelda(tabla, 4);
    }
}