package Procesos;
import Modelo.Pago;
import Vista.JIFPago;
import java.awt.Dimension;

public class ProcesosFrmIPagos {
    public static void PresentacionPagos(JIFPago fp) {
        fp.setTitle("REGISTRO PAGOS");
        fp.setVisible(true);
        fp.setSize(new Dimension(848, 533));
    }

    public static void Estado1(JIFPago fp) {
        fp.btnBuscar.setEnabled(true);
        fp.btnPago.setEnabled(false);
        fp.btnImprimir.setEnabled(false);
    }
    
    public static void Estado2(JIFPago fp) {
        fp.btnBuscar.setEnabled(true);
        fp.btnPago.setEnabled(true);
        fp.btnImprimir.setEnabled(true);
    }
    
    public static Pago BusquedaPago(JIFPago fp) {
        Pago p = new Pago();
        p.setCodAlm(Integer.parseInt(fp.txtCodEst.getText()));
        return p;
    }
    
    public static Pago LeerPago(JIFPago fp) {
        Pago p = new Pago();
        p.setCuenta(fp.txtNTarjeta.getText());
        p.setMMAA(fp.txtMMAA.getText());
        p.setCvv(fp.txtCVV.getText());
        return p;
    }
}