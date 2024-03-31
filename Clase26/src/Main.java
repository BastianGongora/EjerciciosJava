public class Main {
    /**
     *
     * El programa proporcionado tiene un bucle while en
     * el método depurar, pero este bucle nunca se detendrá porque
     * la condición x < 1 nunca cambia dentro del bucle. Esto causará un bucle infinito
     */
    public static void main(String[] args) {
        int x=0;
        depurar(x);
    }
    public static  void depurar (int x){
        while (x<1){
            System.out.println("ciclo");
        }
    }
}