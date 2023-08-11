public class Main {

    public static void main(String[] args) {
        //cree el motor
        Motor motorCarro = new Motor("china", "china23");
        // cree las llantas
        Llanta llanta1 = new Llanta("marcaRin", "1");
        Llanta llanta2 = new Llanta("marcaRin", "2");
        Llanta llanta3 = new Llanta("marcaRin", "3");
        Llanta llanta4 = new Llanta("marcaRin", "4");
        // cree el carro
        Carro carroMazda =  new Carro(motorCarro);
        //asigne llantas
        carroMazda.agregarLlantas(llanta1);
        carroMazda.agregarLlantas(llanta2);
        carroMazda.agregarLlantas(llanta3);
        carroMazda.agregarLlantas(llanta4);

        // obtener las relaciones de la clase principal que es carro
        Motor motor = carroMazda.getMotor();
        Llanta llanta =  carroMazda.obtenerLlanta(2);
    }

}