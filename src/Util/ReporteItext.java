package Util;
import Formatos.Mensajes;
import Modelo.Tabla;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReporteItext {
    
    public static void generarReporteEstudiante(List<Tabla> pagos) {
        Document document = new Document();
        
        try {
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaActual = dateFormat1.format(new Date());
            
            String ruta = "src/com/reportes/Boleta_Pago_Estudiante_" + fechaActual + ".pdf";
            ArchivoUtil.crearCarpeta(ruta);
            PdfWriter.getInstance(document, new FileOutputStream(ruta));
            document.open();
            
            // Título del reporte
            Paragraph titulo = new Paragraph("Boleta de Pagos - Estudiante", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            
            // Datos del estudiante
            Paragraph datosEstudiante = new Paragraph();
            
            datosEstudiante.add(new Chunk("Código: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(pagos.get(0).getCodAlm() + "\n");
            datosEstudiante.add(new Chunk("Nombre: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(pagos.get(0).getNombre() + "\n");
            datosEstudiante.add(new Chunk("Grado: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(pagos.get(0).getGrd() + "\n");
            datosEstudiante.add(new Chunk("Sección: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(pagos.get(0).getSec() + "\n\n");
            document.add(datosEstudiante);
            
            // Tabla de cuotas pagadas
            PdfPTable tablaCuotas = new PdfPTable(2);
            tablaCuotas.setWidthPercentage(100);
            
            PdfPCell cellDescripcion = new PdfPCell(new Phrase("Descripción", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            PdfPCell cellMonto = new PdfPCell(new Phrase("Monto", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            
            tablaCuotas.addCell(cellDescripcion);
            tablaCuotas.addCell(cellMonto);
            
            double totalPagado = 0.0;
            
            for (Tabla pago : pagos) {
                tablaCuotas.addCell(pago.getDesc());
                tablaCuotas.addCell(String.valueOf(pago.getMonto()));
                totalPagado += pago.getMonto();
            }
            
            document.add(tablaCuotas);
            
            // Total pagado
            Paragraph total = new Paragraph("\nTotal pagado: " + totalPagado, FontFactory.getFont(FontFactory.HELVETICA_BOLD));
            document.add(total);
            
            document.close();
            
            Mensajes.M1("Boleta de pago generada correctamente.");
            
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Util.ReporteItext.generarReporteEstudiante()");
        }
    }
}