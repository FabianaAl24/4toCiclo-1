package Modelo;
import java.util.Date;

public class Tabla extends Alumno {
    private int id;
    private String desc;
    private Date fini;
    private Date ffin;
    private float monto;
    private String indicador;
    
    public Tabla() {}
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getDesc() {return desc;}
    public void setDesc(String desc) {this.desc = desc;}

    public Date getFini() {return fini;}
    public void setFini(Date fini) {this.fini = fini;}

    public Date getFfin() {return ffin;}
    public void setFfin(Date ffin) {this.ffin = ffin;}

    public float getMonto() {return monto;}
    public void setMonto(float monto) {this.monto = monto;}
    
    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}

    public Object[] RegistroTabla() {
        Object[] fila = {" ",id,desc,fini,ffin,monto};
        return fila;
    }
}