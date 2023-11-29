package DAO;

import Modelo.Pago;
import Util.ArchivoUtil;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PagoDAO {

    private static final String PAGOS_FILE = "src/com/archivos_txt/pagos.txt";
    private List<Pago> pagos;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static int contadorID = 1;

    public PagoDAO() {
        pagos = new ArrayList<>();
        ArchivoUtil.crearCarpeta(PAGOS_FILE);
        cargarPagosDesdeArchivo();
    }

    private void cargarPagosDesdeArchivo() {
        try ( BufferedReader reader = new BufferedReader(new FileReader(PAGOS_FILE))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String idpago = partes[0];
                Date fechaPago = dateFormat.parse(partes[1]);
                double monto = Double.parseDouble(partes[2]);

                //Crear un objeto Pago
                Pago pago = new Pago(idpago, fechaPago, monto);

                //Agregar el pago a la lista
                pagos.add(pago);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public Pago obtenerPagoPorId(String idPago) {
        for (Pago pago : pagos) {
            if (pago.getIdPago().equals(idPago)) {
                return pago;
            }
        }
        return null;// Pago no encontrado
    }

    public void crearPago(Pago pago) {
        pago.setIdPago(generarId());
        pagos.add(pago);
        guardarPagosEnArchivo();
    }

    public String generarId() {
        String prefijo = "COPD";
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10000);
        return prefijo + String.format("%04d", numeroAleatorio);
    }

    //Metodo para guardar pagos en el archivo
    public void guardarPagosEnArchivo() {
        try ( PrintWriter writer = new PrintWriter(new FileWriter(PAGOS_FILE))) {
            for (Pago pago : pagos) {
                String fechaPagoStr = dateFormat.format(pago.getFechaPago());
                writer.println(pago.getIdPago() + "," + fechaPagoStr + "," + pago.getMonto());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar pago :"+ e.getMessage());
        }
    }
}
