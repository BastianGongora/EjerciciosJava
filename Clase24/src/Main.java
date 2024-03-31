import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        String x = scanner.nextLine();

        double numero = Double.parseDouble(x.replace(',', '.'));
        double doble = numero * 2;
        double triple = numero * 3;
        double raiz = Math.sqrt(numero);
        double siete = Math.pow(numero, 7);

        System.out.println("El doble del número ingresado es: " + doble);
        System.out.println("El triple del número ingresado es: " + triple);
        System.out.println("La raiz del número ingresado es: " + raiz);
        System.out.println("La elevacion del número ingresado a 7 es: " + siete);
    }
}