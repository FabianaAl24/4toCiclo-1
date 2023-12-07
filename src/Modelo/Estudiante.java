package Modelo;

public class Estudiante extends Persona{
    private String codigoEstudiante;
    private String estudiante;
    private String grado;
    private String seccion;

    public Estudiante() {
        super();
    }

    public Estudiante(String codigoEstudiante, String nombre, String apellido, int dni, String telefono, String grado, String seccion) {
        super(dni, nombre, apellido, telefono);
        this.codigoEstudiante = codigoEstudiante;
        this.grado = grado;
        this.seccion = seccion;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigoEstudiante=" + codigoEstudiante + ", estudiante=" + estudiante + ", grado=" + grado + ", seccion=" + seccion + '}';
    } 
}