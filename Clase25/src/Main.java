import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresa tu ocupación: ");
        String ocupacion = scanner.nextLine();

        System.out.println("¡Un gusto, " + nombre + "! Tienes " + edad + " años y tu ocupación es " + ocupacion + ". un placer conocerte");

    }
}