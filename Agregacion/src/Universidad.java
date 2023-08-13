public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;
    private int contadorEstudiantes;

    public Universidad(String nombre, int capacidadMaximaEstudiantes) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[capacidadMaximaEstudiantes];
        this.contadorEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
            System.out.println("Estudiante agregado a la universidad.");
        } else {
            System.out.println("La universidad está llena, no se puede agregar más estudiantes.");
        }
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCantidadEstudiantes() {
        return contadorEstudiantes;
    }

}
