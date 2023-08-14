public class Banco {
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void RealizarTransferenciaEntreCuentas(double monto, Cuenta origen, Cuenta destino) {
        if (monto <= origen.getSaldoCuenta()) {
            origen.setReintegro(monto);
            destino.setIngreso(monto);
            System.out.println("Transferencia de $" + monto + " realizada desde la cuenta " +
                    origen.getDatosCuenta() + " a la cuenta " + destino.getDatosCuenta());
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }

    public void ImprimirNumeroCuentas() {
        System.out.println("Número de cuenta 1: " + cuenta1.getDatosCuenta());
        System.out.println("Número de cuenta 2: " + cuenta2.getDatosCuenta());
    }

}

