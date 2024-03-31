import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arreglando

        double[] nReales = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            nReales[i] = scanner.nextDouble();
        }
        System.out.println("Los números  ingresados son:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Número " + (i + 1) + ": " + nReales[i]);
        }

        scanner.close();

        for (int i = 0; i < nReales.length - 1; i++) {
            for (int j = 0; j < nReales.length - 1 - i; j++) {
                if (nReales[j] < nReales[j + 1]) {
                    double temp = nReales[j];
                    nReales[j] = nReales[j + 1];
                    nReales[j + 1] = temp;
                }
            }
        }


        System.out.println("Los números reales ordenados de mayor a menor son:");
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Número " + (i + 1) + ": El número mayor es : * " + nReales[i]);
            } else {
                System.out.println("Número " + (i + 1) + ": " + nReales[i]);
            }

        }
    }
}