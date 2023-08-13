public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad XYZ", 100);
        Estudiante estudiante1 = new Estudiante("Juan", 20, 101);
        Estudiante estudiante2 = new Estudiante("María", 22, 102);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        System.out.println("Nombre de la universidad: " + universidad.getNombre());

        Estudiante[] estudiantesEnUniversidad = universidad.getEstudiantes();
        int cantidadEstudiantes = universidad.getCantidadEstudiantes();

        System.out.println("Información de los estudiantes en la universidad:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Nombre: " + estudiantesEnUniversidad[i].getNombre() +
                    ", Edad: " + estudiantesEnUniversidad[i].getEdad() +
                    ", Número de estudiante: " + estudiantesEnUniversidad[i].getNumeroEstudiante());
        }
    }
}
