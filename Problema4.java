import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número total de piezas a capturar:");
        int totalPiezas = scanner.nextInt();
        int entre18y52 = 0;  
        int masDe52 = 0;     

        for (int i = 1; i <= totalPiezas; i++) {
            System.out.println("Ingrese el peso de la pieza " + i + " (en kilogramos):");
            double peso = scanner.nextDouble();
            if (peso >= 1.8 && peso <= 5.2) {
                entre18y52++;
            } else if (peso > 5.2) {
                masDe52++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Piezas con peso entre 1.8 Kg y 5.2 Kg: " + entre18y52);
        System.out.println("Piezas con peso mayor a 5.2 Kg: " + masDe52);
        System.out.println("Cantidad total de piezas procesadas: " + totalPiezas);

        scanner.close();
    }
}
