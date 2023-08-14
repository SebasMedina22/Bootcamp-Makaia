public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Titular 1", 1000);
        Cuenta cuenta2 = new Cuenta("Titular 2", 1500);

        Banco banco = new Banco(cuenta1, cuenta2);

        banco.RealizarTransferenciaEntreCuentas(300, cuenta1, cuenta2);
        banco.RealizarTransferenciaEntreCuentas(200, cuenta2, cuenta1);

        banco.ImprimirNumeroCuentas();
    }
}