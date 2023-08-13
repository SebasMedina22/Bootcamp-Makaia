public class Casa {
    private Habitacion[] habitaciones;
    private int contadorHabitaciones;
    private final int CAPACIDAD_MAXIMA = 100;

    public Casa() {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        contadorHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        if (contadorHabitaciones < CAPACIDAD_MAXIMA) {
            habitaciones[contadorHabitaciones] = habitacion;
            contadorHabitaciones++;
            System.out.println("Habitación agregada a la casa.");
        } else {
            System.out.println("La capacidad máxima de habitaciones ha sido alcanzada.");
        }
    }

    public void destruirCasa() {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        contadorHabitaciones = 0;
        System.out.println("La casa ha sido destruida y todas las habitaciones eliminadas.");
    }

    public void mostrarInformacionCasa() {
        System.out.println("Información de las habitaciones en la casa:");
        for (int i = 0; i < contadorHabitaciones; i++) {
            System.out.println("Habitación " + habitaciones[i].getNumeroHabitacion() +
                    ", Tamaño: " + habitaciones[i].getTamano() + " metros cuadrados.");
        }
    }
}
