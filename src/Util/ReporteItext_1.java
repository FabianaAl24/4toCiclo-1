package Util;
import Formatos.Mensajes;
import Modelo.Tabla;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReporteItext_1 {

public static void generarReporteEstudiante(List<Tabla> matricula) {
        Document document = new Document();
        
        try {
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaActual = dateFormat1.format(new Date());
            
            String ruta = "src/com/reportes/Matricula_Estudiante_" + fechaActual + ".pdf";
            ArchivoUtil.crearCarpeta(ruta);
            PdfWriter.getInstance(document, new FileOutputStream(ruta));
            document.open();
            
            // Título del reporte
            Paragraph titulo = new Paragraph("Matricula - Estudiante", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            
            // Datos del estudiante
            Paragraph datosEstudiante = new Paragraph();
            
            datosEstudiante.add(new Chunk("Código: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getCodAlm() + "\n");
            datosEstudiante.add(new Chunk("DNI: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getDNI()+ "\n");
            datosEstudiante.add(new Chunk("Nombre: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getNombre() + "\n");
            datosEstudiante.add(new Chunk("Genero: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getGenero()+ "\n");
            datosEstudiante.add(new Chunk("Grado: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getGrd() + "\n");
            datosEstudiante.add(new Chunk("Sección: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getSec() + "\n\n");
            datosEstudiante.add(new Chunk("Fecha de Matricula: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
            datosEstudiante.add(matricula.get(0).getFecha()+ "\n\n");
            
            document.add(datosEstudiante);
            
            document.close();
            
            Mensajes.M1("Matricula generada correctamente...");
            
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Util.ReporteItext_1.generarReporteEstudiante()");
        }
    }
}