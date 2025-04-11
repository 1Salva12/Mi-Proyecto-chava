public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 20:");
        imprimirPares(1, 20);
        System.out.println("\n---");
        int numero1 = 10;
        if (esPar(numero1)) {
            System.out.println(numero1 + " es un número par.");
        } else {
            System.out.println(numero1 + " no es un número par.");
        }
        int numero2 = 7;
        if (esPar(numero2)) {
            System.out.println(numero2 + " es un número par.");
        } else {
            System.out.println(numero2 + " no es un número par.");
        }
        System.out.println("\n---");
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Números pares en el array:");
        int[] paresEnArray = obtenerPares(numeros);
        for (int par : paresEnArray) {
            System.out.print(par + " ");
        }
        System.out.println();
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void imprimirPares(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (esPar(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int[] obtenerPares(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (esPar(numero)) {
                contador++;
            }
        }
        int[] pares = new int[contador];
        int indice = 0;
        for (int numero : numeros) {
            if (esPar(numero)) {
                pares[indice] = numero;
                indice++;
            }
        }
        return pares;
    }
}