package Modelo;
import java.util.Date;

public class Alumno extends Persona{
    /*DATOS PERSONA
    *...
    DATOS ALUMNO*/
    private String sec;
    private String grd;
    private Date fecha;
    private int CodAlm;
    private String indicador;
    
    public Alumno() {}

    public String getSec() {return sec;}
    public void setSec(String sec) {this.sec = sec;}

    public String getGrd() {return grd;}
    public void setGrd(String grd) {this.grd = grd;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public int getCodAlm() {return CodAlm;}
    public void setCodAlm(int CodAlm) {this.CodAlm = CodAlm;}  

    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}   
    
    public Object[] RegistrarMatricula(int numeracion){        
        Object[] fila = {numeracion,CodAlm,getDNI(),getNombre(),getGenero(),sec,grd,fecha,indicador};
        return fila;
    }
}