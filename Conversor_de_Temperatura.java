import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convertir a (1) Fahrenheit o (2) Celsius: ");
        int opcion = sc.nextInt();

        System.out.print("Ingresa la temperatura: ");
        double temp = sc.nextDouble();
        double resultado;

        if (opcion == 1) {
            resultado = (temp * 9 / 5) + 32;
            System.out.println("Temperatura en Fahrenheit: " + resultado + "°F");
        } else {
            resultado = (temp - 32) * 5 / 9;
            System.out.println("Temperatura en Celsius: " + resultado + "°C");
        }

        sc.close();
    }
}

