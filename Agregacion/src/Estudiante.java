public class Estudiante {
    private String nombre;
    private int edad;
    private int numeroEstudiante;

    public Estudiante(String nombre, int edad, int numeroEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    // Métodos getters y setters para los atributos nombre, edad y numeroEstudiante
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }
}

