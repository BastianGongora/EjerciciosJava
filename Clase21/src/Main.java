public class Main {
    public static void main(String[] args) {
        // Iterando

        int suma = 0;
        int suma2 = 0;
        int suma3 = 0;
        int contador = 1;
        int contador2 = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("for");
        System.out.println("La suma del 1 al 10 es: " + suma);
        // Proceso Do While
        do {

            suma2 += contador;
            contador++;
        } while (contador <= 10);

        System.out.println("do while");
        System.out.println("La suma del 1 al 10 es: " + suma2);


        // Usamos un bucle while
        while (contador2 <= 10) {

            suma3 += contador2;

            contador2++;
        }

        System.out.println("while");
        System.out.println("La suma del 1 al 10 es: " + suma3);

    }
}