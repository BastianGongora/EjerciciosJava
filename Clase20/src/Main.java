import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Mostrar el menú para juntar partes
            System.out.println("Menú:");
            System.out.println("1. Verificar mes");
            System.out.println("2. Verificar si un número es par o impar");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verificarMes();
                    break;
                case 2:
                    verificarParImpar();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción del menú.");
                    break;
            }
        }
        System.out.println("------------------------------------------------------------------------------");
        scanner.close();
    }
    public static void verificarMes() {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número del mes
        System.out.print("Ingresa el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        // Realizar el switch case para cada mes del año junto a la estacion
        switch (numeroMes) {
            case 1:
                System.out.println("Enero");
                System.out.println("Estación Verano");
                break;
            case 2:
                System.out.println("Febrero");
                System.out.println("Estación Verano");
                break;
            case 3:
                System.out.println("Marzo");
                System.out.println("Estación Verano");
                break;
            case 4:
                System.out.println("Abril");
                System.out.println("Estación Otoño");
                break;
            case 5:
                System.out.println("Mayo");
                System.out.println("Estación Otoño");
                break;
            case 6:
                System.out.println("Junio");
                System.out.println("Estación Otoño");
                break;
            case 7:
                System.out.println("Julio");
                System.out.println("Estación Invierno");
                break;
            case 8:
                System.out.println("Agosto");
                System.out.println("Estación Invierno");
                break;
            case 9:
                System.out.println("Septiembre");
                System.out.println("Estación Invierno");
                break;
            case 10:
                System.out.println("Octubre");
                System.out.println("Estación Primeravera");
                break;
            case 11:
                System.out.println("Noviembre");
                System.out.println("Estación Primeravera");
                break;
            case 12:
                System.out.println("Diciembre");
                System.out.println("Estación Primeravera");
                break;
            default:
                System.out.println("Número de mes inválido. Por favor, ingresa un número del 1 al 12.");
                break;
        }
        System.out.println("------------------------------------------------------------------------------");

    }
    public static void verificarParImpar() {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es 0
        if (numero == 0) {
            System.out.println("El número es 0.");
        } else { // Si no es 0, verificar si es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        }
        System.out.println("------------------------------------------------------------------------------");
    }
}