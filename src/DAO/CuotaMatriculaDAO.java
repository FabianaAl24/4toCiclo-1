package DAO;
import Modelo.CuotaMatricula;
import Modelo.Estudiante;
import Modelo.PagoCuotaMatricula;
import Util.ArchivoUtil;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class CuotaMatriculaDAO {
    private static final String CUOTAS_FILE = "src/com/archivos_txt/cuotasMatricula.txt";
    private List<CuotaMatricula> cuotasMatricula;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static PagoCuotaMatriculaDAO pagoCuotaMatriculaDAO = new PagoCuotaMatriculaDAO();
    private static EstudianteDAO estudianteDAO;
    public CuotaMatriculaDAO() {
        cuotasMatricula = new ArrayList<>();
        ArchivoUtil.crearCarpeta(CUOTAS_FILE);
        cargarCuotasMatriculaDesdeArchivo();

    }

    // Método para cargar cuotas de matrícula desde el archivo
    private void cargarCuotasMatriculaDesdeArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CUOTAS_FILE))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                int idCuota = Integer.parseInt(partes[0]);
                String descripcion = partes[1];
                double monto = Double.parseDouble(partes[2]);
                Date fechaInicio = dateFormat.parse(partes[3]);
                Date fechaLimite = dateFormat.parse(partes[4]);
                String idEstudiante = partes[5];
                estudianteDAO = new EstudianteDAO();
                Estudiante estudiante = estudianteDAO.obtenerEstudiantePorCodigo(idEstudiante);
                CuotaMatricula cuota = new CuotaMatricula(idCuota, descripcion, monto, fechaInicio, fechaLimite, estudiante);
                cuotasMatricula.add(cuota);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar cuotas de matrícula en el archivo
    private void guardarCuotasMatriculaEnArchivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CUOTAS_FILE))) {
            for (CuotaMatricula cuota : cuotasMatricula) {
                String fechaLimiteStr = dateFormat.format(cuota.getFechaLimite());
                writer.println(cuota.getIdCuota() + "," + cuota.getDescripcion() + "," + cuota.getMonto() + "," + fechaLimiteStr + "," + cuota.getEstudiante().getCodigoEstudiante());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para crear una nueva cuota de matrícula
    public void crearCuotaMatricula(CuotaMatricula cuotaMatricula) {
        cuotasMatricula.add(cuotaMatricula);
        guardarCuotasMatriculaEnArchivo();
    }

    // Método para obtener todas las cuotas de matrícula
    public List<CuotaMatricula> obtenerTodasCuotasMatricula() {
        return cuotasMatricula;
    }

    // Método para obtener una cuota de matrícula por su ID
    public CuotaMatricula obtenerCuotaMatriculaPorId(int idCuota) {
        for (CuotaMatricula cuota : cuotasMatricula) {
            if (cuota.getIdCuota() == idCuota) {
                return cuota;
            }
        }
        return null; // Cuota de matrícula no encontrada
    }

    public List<CuotaMatricula> obtenerCuotasPorEstudiante(Estudiante estudiante) {
        List<CuotaMatricula> cuotasEstudiante = new ArrayList<>();

        for (CuotaMatricula cuota : cuotasMatricula) {
            if (cuota.getEstudiante() == null) {
                continue;
            }
            if (cuota.getEstudiante().getCodigoEstudiante().equalsIgnoreCase(estudiante.getCodigoEstudiante())) {
                cuotasEstudiante.add(cuota);
            }
        }

        return cuotasEstudiante;
    }

    public List<CuotaMatricula> obtenerCuotasPendientesPorEstudiante(Estudiante estudiante) {
        List<CuotaMatricula> cuotasPendientesEstudiante = new ArrayList<>();
        pagoCuotaMatriculaDAO = new PagoCuotaMatriculaDAO();
        List<PagoCuotaMatricula> pagosCuotaMatriculas = pagoCuotaMatriculaDAO.buscarPorCodigoEstudiante(estudiante.getCodigoEstudiante());
        List<CuotaMatricula> cuotasEstudiante = obtenerCuotasPorEstudiante(estudiante);
        for (CuotaMatricula cm : cuotasEstudiante) {
            boolean encontrado = false;

            for (PagoCuotaMatricula pagoCuotaMatricula : pagosCuotaMatriculas) {
                if (cm.getIdCuota() == pagoCuotaMatricula.getCuotaMatricula().getIdCuota()) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                cuotasPendientesEstudiante.add(cm);
            }
        }

        return cuotasPendientesEstudiante;
    }

    // Método para actualizar una cuota de matrícula
    public void actualizarCuotaMatricula(CuotaMatricula cuotaActualizada) {
        for (int i = 0; i < cuotasMatricula.size(); i++) {
            CuotaMatricula cuota = cuotasMatricula.get(i);
            if (cuota.getIdCuota() == cuotaActualizada.getIdCuota()) {
                cuotasMatricula.set(i, cuotaActualizada);
                guardarCuotasMatriculaEnArchivo();
                return;
            }
        }
    }

    // Método para eliminar una cuota de matrícula por su ID
    public void eliminarCuotaMatriculaPorId(int idCuota) {
        cuotasMatricula.removeIf(cuota -> cuota.getIdCuota() == idCuota);
        guardarCuotasMatriculaEnArchivo();
    }
}
