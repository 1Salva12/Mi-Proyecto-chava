import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las dimensiones de las matrices
        System.out.println("Ingrese el número de filas para la primera matriz:");
        int filas1 = scanner.nextInt();
        System.out.println("Ingrese el número de columnas para la primera matriz:");
        int columnas1 = scanner.nextInt();

        System.out.println("Ingrese el número de filas para la segunda matriz:");
        int filas2 = scanner.nextInt();
        System.out.println("Ingrese el número de columnas para la segunda matriz:");
        int columnas2 = scanner.nextInt();

        // Verificar si las dimensiones son compatibles para la suma
        if (filas1 != filas2 || columnas1 != columnas2) {
            System.out.println("Las matrices no tienen las mismas dimensiones. No se pueden sumar.");
            scanner.close();
            return;
        }

        // Crear las matrices
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        int[][] matrizSuma = new int[filas1][columnas1];

        // Pedir los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("Matriz 1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Pedir los elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print("Matriz 2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Sumar las matrices
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar las matrices originales y la matriz resultante
        System.out.println("\nPrimera Matriz:");
        imprimirMatriz(matriz1);

        System.out.println("\nSegunda Matriz:");
        imprimirMatriz(matriz2);

        System.out.println("\nMatriz Suma:");
        imprimirMatriz(matrizSuma);

        scanner.close();
    }

    // Método auxiliar para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}