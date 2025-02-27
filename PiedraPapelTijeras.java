import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] opciones = {"Piedra", "Papel", "Tijeras"};

        System.out.print("Elige: Piedra, Papel o Tijeras: ");
        String usuario = sc.nextLine().toLowerCase();
        String computadora = opciones[rand.nextInt(3)].toLowerCase();

        System.out.println("Computadora eligió: " + computadora);

        if (usuario.equals(computadora)) {
            System.out.println("¡Es un empate!");
        } else if ((usuario.equals("piedra") && computadora.equals("tijeras")) ||
                   (usuario.equals("papel") && computadora.equals("piedra")) ||
                   (usuario.equals("tijeras") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
        sc.close();
    }
}
