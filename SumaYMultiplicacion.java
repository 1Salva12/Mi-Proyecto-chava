import java.util.Scanner;

public class SumaYMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();

        int suma = num1 + num2;
        int resultado = suma * num3;

        System.out.println("La suma de los dos primeros números es: " + suma);
        System.out.println("El resultado de multiplicar la suma por el tercer número es: " + resultado);
    }
}