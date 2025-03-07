import java.util.Scanner;

public class SumaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();

        int suma = num1 + num2 + num3;

        System.out.println("La suma de los tres números es: " + suma);
    }
}