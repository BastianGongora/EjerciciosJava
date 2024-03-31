import Clases.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Llenar la cafetería");
            System.out.println("2. Vaciar la cafetería");
            System.out.println("3. Agregar café a la cafetería");
            System.out.println("4. Servir una taza de café");
            System.out.println("5. Mostrar cantidad actual de café");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafeteria();
                    System.out.println("La cafetería ha sido llenada.");
                    break;
                case 2:
                    cafetera.vaciarCafeteria();
                    System.out.println("La cafetería ha sido vaciada.");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de café a agregar: ");
                    int cantidadCafe = scanner.nextInt();
                    cafetera.agregarCafeteria(cantidadCafe);
                    System.out.println("Se ha agregado café a la cafetería.");
                    break;
                case 4:
                    System.out.print("Ingrese el tamaño de la taza a servir: ");
                    int tamanoTaza = scanner.nextInt();
                    cafetera.servirTaza(tamanoTaza);
                    break;
                case 5:
                    System.out.println("La cantidad actual de café en la cafetería es: " + cafetera.getCapacidadActual() + " ml");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }



    }
