import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroCuentaAleatorio();
    }

    public void setIngreso(double monto) {
        saldoDeCuenta += monto;
        System.out.println("Ingreso de $" + monto + " realizado. Nuevo saldo: $" + saldoDeCuenta);
    }

    public void setReintegro(double monto) {
        if (monto <= saldoDeCuenta) {
            saldoDeCuenta -= monto;
            System.out.println("Reintegro de $" + monto + " realizado. Nuevo saldo: $" + saldoDeCuenta);
        } else {
            System.out.println("Saldo insuficiente para realizar el reintegro.");
        }
    }

    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "Titular: " + nombreDelTitular + ", Saldo: $" + saldoDeCuenta + ", Número de cuenta: " + numeroDeCuenta;
    }

    private long generarNumeroCuentaAleatorio() {
        Random random = new Random();
        return Math.abs(random.nextLong()); // Número de cuenta positivo
    }
}
