package Principal;
import Controlador.*;
import Vista.*;

public class Main {
    public static JIFInicio fini;
    public static ControladorInicio ctrl_fini;
    
    public static JIFMatricula fma;
    public static ControladorMatricula ctrl_fma;
    
    public static JIFPago fp;
    public static ControladorPagos ctrl_fp;
    
    public static JIFMensajeria fme;
    public static ControladorMensajeria ctrl_fme;
    
    public static JIFAyuda fa;
    public static ControladorAyuda ctrl_fa;
    //MenuItem
    
    public static Menu fm;
    
    public static Login fl;
    public static ControladorLogin ctrl_fl;

    public static void main(String[] args) {
        fl = new Login();
        ctrl_fl = new ControladorLogin(fl);
    }
}