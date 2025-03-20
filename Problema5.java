public class Problema5 {
    public static void main(String[] args) {
        int multiplosDe3 = 0;
        int multiplosDe5 = 0;
        int multiplosDe9 = 0;

        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0) { 
                multiplosDe3++;
            }
            if (i % 5 == 0) {
                multiplosDe5++;
            }
            if (i % 9 == 0) {
                multiplosDe9++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Cantidad de múltiplos de 3: " + multiplosDe3);
        System.out.println("Cantidad de múltiplos de 5: " + multiplosDe5);
        System.out.println("Cantidad de múltiplos de 9: " + multiplosDe9);
    }
}
