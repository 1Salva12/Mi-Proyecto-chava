import java.util.Scanner;

public class ContadorDeLetras {

    public static int contarLetras(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o varias palabras:");
        String entrada = scanner.nextLine();

        int totalLetras = contarLetras(entrada);

        System.out.println("El número total de letras en la entrada es: " + totalLetras);

        scanner.close();
    }
}