public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio clase 17 parte 1");
        // Declarar y asignar un valor a una variable tipo char para un RUT
        // Si no estoy mal una variable char no puede obtener todo el rut, por ello lo cambie a String
        String rut = "17.815.733-7";
        System.out.println("RUT: " + rut);
        System.out.println("--------------------------------------------");
        // Declarar y asignar un valor a una variable tipo boolean para indicar si es estudiante
        boolean esEstudiante = true;
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("--------------------------------------------");
        // Declarar una variable String para un apellido y concatenarla con un nombre
        String apellido = "Gongora";
        String nombre = "Bastian";
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio clase 17 parte 2");
        // Variables enteras
        byte miByte = 10;
        short miShort = 1000;
        int miInt = 100000;
        long miLong = 1000000000L; // La "L" al final indica que es un valor long
        System.out.println("--------------------------------------------");
        // Imprimir variables enteras
        System.out.println("Valor de byte: " + miByte);
        System.out.println("Valor de short: " + miShort);
        System.out.println("Valor de int: " + miInt);
        System.out.println("Valor de long: " + miLong);
        System.out.println("--------------------------------------------");
        // Variables decimales
        float miFloat = 3.55f; // La "f" al final indica que es un valor float
        double miDouble = 3.6666;

        // Imprimir variables decimales
        System.out.println("Valor de float: " + miFloat);
        System.out.println("Valor de double: " + miDouble);
    }
}