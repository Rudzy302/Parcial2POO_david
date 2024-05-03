class Estudiante {
    String nombre;
    int edad;
    Long carrera;
    double promedio;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, Long carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Método toString para imprimir información del estudiante

    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera=" + carrera +
                ", promedio=" + promedio +
                '}';
    }
}