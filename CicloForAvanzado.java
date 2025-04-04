public class CicloForAvanzado {
    public static void main(String[] args) {
        int suma = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Análisis de los números del 1 al 100:\n");

        for (int i = 1; i <= 100; i++) {
            System.out.print("Número: " + i);

            // Verifica si es par o impar
            if (i % 2 == 0) {
                System.out.println(" -> Par");
                pares++;
            } else {
                System.out.println(" -> Impar");
                impares++;
            }

            // Acumula la suma total
            suma += i;
        }

        // Resultados finales
        System.out.println("\nResumen:");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Suma total de los números del 1 al 100: " + suma);
    }
}
