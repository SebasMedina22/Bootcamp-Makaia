public class Carro {

    private Motor motor;
    private Llanta[] llantas;
    private int contadorLLantas = 0;

    public Carro(Motor motor){
        this.motor = motor;
        this.llantas = new Llanta[4];
    }

    public void agregarLlantas(Llanta llanta) {
        this.llantas[contadorLLantas] = llanta;
        this.contadorLLantas++;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public Llanta obtenerLlanta(int numeroLlanta) {
        return  this.llantas[numeroLlanta];
    }

}
