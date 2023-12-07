package Modelo;

public abstract class Persona {
    private int dni;
    private String nombre;
    private String genero;
    private String estado;
    
    public Persona(){}

    public Persona(int dni, String nombre, String genero, String estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.genero = genero;
        this.estado = estado;
    }
    
    public int getDNI() {return dni;}
    public void setDNI(int dni) {this.dni = dni;}
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
}