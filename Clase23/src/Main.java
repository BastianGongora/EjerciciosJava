import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();


        String letras45 = "";
        if (cadena.length() >= 5) {
            letras45 = cadena.substring(3, 5);
        } else {
            System.out.println("La cadena es demasiado corta para extraer la cuarta y quinta letra.");
        }


        System.out.println("La cadena es: " + cadena);
        System.out.println("La cuarta y quinta letra son: " + letras45);


        int cantidadVocales = contarVocales(cadena);
        System.out.println("Cantidad de vocales es: " + cantidadVocales);

        scanner.close();
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = Character.toLowerCase(cadena.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
}