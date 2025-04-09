import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.util.Scanner;

public class MensajeroIP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Enviar mensaje");
        System.out.println("2. Recibir mensaje");
        System.out.print("Ingrese su opción (1 o 2): ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        switch (opcion) {
            case 1:
                enviarMensaje(scanner);
                break;
            case 2:
                recibirMensaje(scanner);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }

    public static void enviarMensaje(Scanner scanner) {
        System.out.print("Ingrese la dirección IP del destinatario: ");
        String ipDestino = scanner.nextLine();

        System.out.print("Ingrese el puerto del destinatario: ");
        int puertoDestino = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el mensaje a enviar: ");
        String mensaje = scanner.nextLine();

        try (Socket socket = new Socket(ipDestino, puertoDestino);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println(mensaje);
            System.out.println("Mensaje enviado a " + ipDestino + ":" + puertoDestino + ": " + mensaje);
        } catch (IOException e) {
            System.err.println("Error al enviar el mensaje a " + ipDestino + ":" + puertoDestino + ": " + e.getMessage());
        }
    }

    public static void recibirMensaje(Scanner scanner) {
        System.out.print("Ingrese el puerto en el que desea escuchar: ");
        int puertoEscucha = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        try (ServerSocket serverSocket = new ServerSocket(puertoEscucha)) {
            System.out.println("Esperando mensajes en el puerto " + puertoEscucha + "...");
            Socket clienteSocket = serverSocket.accept();
            InetAddress direccionCliente = clienteSocket.getInetAddress();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()))) {
                String mensajeRecibido;
                if ((mensajeRecibido = in.readLine()) != null) {
                    System.out.println("Mensaje recibido de " + direccionCliente.getHostAddress() + ": " + mensajeRecibido);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al recibir el mensaje en el puerto " + puertoEscucha + ": " + e.getMessage());
        }
    }
}