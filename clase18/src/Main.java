import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------");
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");

        int numero1 = scanner.nextInt();


        System.out.print("Ingrese el segundo número: ");

        int numero2 = scanner.nextInt();

        // Calcular la suma de los dos números ingresados
        int suma = numero1 + numero2;

        // Mostrar la suma de los dos números
        System.out.println("La suma de " + numero1 + " y el " + numero2 + " es: " + suma);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ingresa un numero para elevarlo al cuadrado");
        double numero = scanner.nextDouble();
        double cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("-------------------------------------------------------------");

        // Leer dos palabras y concatenarlas en una frase
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.next();
        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.next();
        String frase = palabra1 + " " + palabra2;
        System.out.println("La frase concatenada es: " + frase);

        System.out.println("-------------------------------------------------------------");

        // Pedir dos números y comparar si son iguales
        System.out.print("Ingresa el primer número: ");
        int numero3 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero4 = scanner.nextInt();
        boolean sonIguales = numero3 == numero4;
        System.out.println("¿Los números son iguales?: " + sonIguales);


        scanner.close();
        }
    }
