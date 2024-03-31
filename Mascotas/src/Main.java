import Mascotas.Clase.Perro;
import Mascotas.Clase.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Gómez", 30, "12345678-9", "Bobby");
        Persona persona2 = new Persona("María", "López", 25, "98765432-1", "Luna");


        // Mostrar información de las personas
        System.out.println("Información de Persona 1:");
        persona1.mostrarInformacion();

        System.out.println("Información de Persona 2:");
        persona2.mostrarInformacion();
    }
}