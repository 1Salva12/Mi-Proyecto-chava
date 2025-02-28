import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().trim();

        // Dividir la frase en palabras usando espacios como separador
        String[] palabras = frase.split("\\s+");
        int totalPalabras = (frase.isEmpty()) ? 0 : palabras.length;

        System.out.println("Número de palabras: " + totalPalabras);
        sc.close();
    }
}
