package Modelo;
import conexion.Conector;

public class Messenger {
    
    public static Conector Cliente;
    
    public static void iniciarcliente() { 
        Cliente = new Conector();
    }
    
    public static void iniciarcliente(String ip) {
        Cliente = new Conector(ip);
        Cliente.start();
    }
}