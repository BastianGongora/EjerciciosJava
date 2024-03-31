import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instanciar un objeto de la clase CuentaBancaria con datos proporcionados
        CuentaBancaria cuenta = new CuentaBancaria(123456789, 5000.0, "Juan Pérez");

        // Mostrar los detalles de la cuenta bancaria
        System.out.println("Detalles de la cuenta bancaria:");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular());
        System.out.println("----------------------------------------------");
        // Solicitar al usuario que ingrese la cantidad a ingresar
        System.out.print("Ingrese la cantidad a ingresar: ");
        double cantidadIngreso = scanner.nextDouble();

        // Ingresar la cantidad a la cuenta bancaria
        cuenta.ingresarDinero(cantidadIngreso);
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
}