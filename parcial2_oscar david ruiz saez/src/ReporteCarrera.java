class ReporteCarrera {
    Carrera carrera;
    double promedioNotas;
    double promedioEdad;

    public ReporteCarrera(Carrera carrera, double promedioNotas, double promedioEdad) {
        this.carrera = carrera;
        this.promedioNotas = promedioNotas;
        this.promedioEdad = promedioEdad;
    }


    public String toString() {
        return "Carrera: " + carrera.nombre + ", Promedio de Notas: " + promedioNotas + ", Promedio de Edad: " + promedioEdad;
    }
}