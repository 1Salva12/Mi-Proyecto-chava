import java.util.Scanner;

public class MultiplicacionCuatroNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();

        System.out.println("Ingresa el cuarto número:");
        int num4 = scanner.nextInt();

        int multiplicacion = num1 * num2 * num3 * num4;

        System.out.println("La multiplicación de los cuatro números es: " + multiplicacion);
    }
}