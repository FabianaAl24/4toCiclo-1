package Util;
import Formatos.Mensajes;
import java.io.File;
import java.io.IOException;

public class ArchivoUtil {
    public static void crearCarpeta(String path){
        File archivo = new File(path);
        File directorio = archivo.getParentFile();

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                Mensajes.M1("Directorio creado con exito...");
            } else {
                Mensajes.M1("No se pudo crear el directorio...");
            }
        }

        try {
            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    Mensajes.M1("Archivo creado con exito...");
                } else {
                    Mensajes.M1("No se pudo crear el archivo...");
                }
            }
        } catch (IOException e) {
            Mensajes.M1("Error al crear el archivo: " + e.getMessage());
        }
    }
}