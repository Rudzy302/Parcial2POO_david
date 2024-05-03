import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        // Imprimir la información de todos los estudiantes
        System.out.println("Información de los estudiantes:");
        for (Estudiante estudiante : listaEstudiante.estudiantes) {
            System.out.println(estudiante);
        }

        // Imprimir reportes de carreras
        imprimirReportes(listaEstudiante, listaCarrera);
    }

    // Método para imprimir reportes de carreras
    public static void imprimirReportes(ListaEstudiante listaEstudiante, ListaCarrera listaCarrera) {
        // Mapas para almacenar temporariamente los totales
        Map<Long, Double> sumNotas = new HashMap<>();
        Map<Long, Integer> sumEdades = new HashMap<>();
        Map<Long, Integer> countEstudiantes = new HashMap<>();

        // Inicializar los mapas
        for (Carrera carrera : listaCarrera.carreras) {
            sumNotas.put(carrera.codigo, 0.0);
            sumEdades.put(carrera.codigo, 0);
            countEstudiantes.put(carrera.codigo, 0);
        }

        // Calcular sumas de notas y edades
        for (Estudiante estudiante : listaEstudiante.estudiantes) {
            Long codigoCarrera = estudiante.carrera;
            sumNotas.put(codigoCarrera, sumNotas.get(codigoCarrera) + estudiante.promedio);
            sumEdades.put(codigoCarrera, sumEdades.get(codigoCarrera) + estudiante.edad);
            countEstudiantes.put(codigoCarrera, countEstudiantes.get(codigoCarrera) + 1);
        }

        // Imprimir reportes de carreras
        System.out.println("\nReportes de Carreras:");
        for (Carrera carrera : listaCarrera.carreras) {
            double promedioNotas = sumNotas.get(carrera.codigo) / countEstudiantes.get(carrera.codigo);
            double promedioEdad = (double) sumEdades.get(carrera.codigo) / countEstudiantes.get(carrera.codigo);
            System.out.println("Carrera: " + carrera.nombre + ", Promedio de Notas: " + promedioNotas + ", Promedio de Edad: " + promedioEdad);
        }

    }
}
