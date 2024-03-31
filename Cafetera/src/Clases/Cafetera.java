package Clases;

public class Cafetera {

    private int capacidadMaxima=1000;
    private int capacidadActual=0;
    //Contructores
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    // Método para llenar la cafetería
    public void llenarCafeteria() {
        capacidadActual = capacidadMaxima;

        System.out.println("  ........");
        System.out.println(" |*******|]");
        System.out.println(" \\      / ");
        System.out.println("  `----'");
    }
    public void vaciarCafeteria() {
        capacidadActual = 0;
        System.out.println("  ........");
        System.out.println(" |      |]");
        System.out.println(" \\      / ");
        System.out.println("  `----'");
    }
    public void agregarCafeteria(int cantidadCafe) {
        capacidadActual += cantidadCafe;
    }
    public void servirTaza(int taza) {
        if (capacidadActual >= taza) {
            capacidadActual -= taza;
            System.out.println("  ( (");
            System.out.println("   ) )");
            System.out.println(" ........");
            System.out.println(" |      |]");
            System.out.println(" \\      / ");
            System.out.println("  `----'");

        } else {
            System.out.println("No hay suficiente café en la cafetería, se llena con la cantidad disponible."+ capacidadActual+" ml");

        }
    }

    //Getter - Setter
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }



}
