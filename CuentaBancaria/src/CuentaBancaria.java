public class CuentaBancaria {
    /**
     * Clase 27
     */
    private int numeroCuenta = 1;
    private  double saldoActual =1000;

    private String titular ="akle";

    /**
     * Clase 28
     */
    //Contrutor
    public CuentaBancaria(int numeroCuenta, double saldoActual, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.titular = titular;
    }
    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        saldoActual += cantidad;
        System.out.println("Se han ingresado $" + cantidad + " a la cuenta.");
    }


    //Getter - Setter

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
