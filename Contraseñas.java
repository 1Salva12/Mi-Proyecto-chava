import java.util.Random;

public class GeneradorContrasena {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        StringBuilder contrasena = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            int indice = rand.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        System.out.println("Contraseña generada: " + contrasena);
    }
}
