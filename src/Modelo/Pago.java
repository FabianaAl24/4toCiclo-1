package Modelo;
import java.util.Date;

public class Pago extends Alumno{
    private int idPago;
    //DATOS PERSONA
    //.....
    //DATOS ALUMNO
    //.....
    //DATOS PAGO
    private Date fpago;
    private String cuenta;
    private String MMAA;
    private String cvv;
    private float total;
    
    public Pago() {}
    
    public int getIdPago() {return idPago;}
    public void setIdPago(int idPago) {this.idPago = idPago;}
    
    public Date getFpago() {return fpago;}
    public void setFpago(Date fpago) {this.fpago = fpago;}

    public String getCuenta() {return cuenta;}
    public void setCuenta(String cuenta) {this.cuenta = cuenta;}

    public String getMMAA() {return MMAA;}
    public void setMMAA(String MMAA) {this.MMAA = MMAA;}

    public String getCvv() {return cvv;}
    public void setCvv(String cvv) {this.cvv = cvv;}

    public float getTotal() {return total;}
    public void setTotal(float total) {this.total = total;}
    
        
    public Object[] RegistrarPago(int numeracion){
        Object[] fila = {numeracion,getCodAlm(),getNombre(),getSec(),getGrd(),fpago,cuenta,MMAA,cvv,total};
        return fila;
    }
}