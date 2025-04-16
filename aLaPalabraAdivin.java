import java.util.Random;
import java.util.Scanner;

public class aLaPalabraAdivin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] palabrasSecretas = {"java", "python", "programacion", "codigo", "desarrollo", "computadora"};
        int indicePalabra = random.nextInt(palabrasSecretas.length);
        String palabraSecreta = palabrasSecretas[indicePalabra];
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        int intentosRestantes = 6;
        boolean palabraCompleta = false;

        System.out.println("¡Bienvenido al juego Adivina la Palabra!");
        System.out.println("La palabra secreta tiene " + palabraSecreta.length() + " letras.");
        System.out.println("Tienes " + intentosRestantes + " intentos.");

        while (intentosRestantes > 0 && !palabraCompleta) {
            System.out.println("\nPalabra actual: " + String.valueOf(palabraAdivinada));
            System.out.print("Introduce una letra: ");
            String intentoStr = scanner.next().toLowerCase(); // Convertir a minúscula para comparar

            if (intentoStr.length() == 1 && Character.isLetter(intentoStr.charAt(0))) {
                char letraIntento = intentoStr.charAt(0);
                boolean letraEncontrada = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letraIntento) {
                        palabraAdivinada[i] = letraIntento;
                        letraEncontrada = true;
                    }
                }

                if (letraEncontrada) {
                    System.out.println("¡Correcto! La letra '" + letraIntento + "' está en la palabra.");
                    if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
                        palabraCompleta = true;
                    }
                } else {
                    intentosRestantes--;
                    System.out.println("Incorrecto. Te quedan " + intentosRestantes + " intentos.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, introduce una sola letra.");
            }
        }

        System.out.println("\nLa palabra secreta era: " + palabraSecreta);
        if (palabraCompleta) {
            System.out.println("¡Felicidades! ¡Adivinaste la palabra!");
        } else {
            System.out.println("¡Se te acabaron los intentos! ¡Mejor suerte la próxima vez!");
        }

        scanner.close();
    }
}