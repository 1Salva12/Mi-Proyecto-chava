import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class Tienda extends JFrame {
    
    // Componentes de la interfaz
    private JTextField precioField;
    private JButton generarButton;
    private JLabel codigoLabel;
    private Connection conn;

    // Constructor
    public Tienda() {
        // Configuración de la ventana principal
        setTitle("Tienda");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear componentes
        precioField = new JTextField(10);
        generarButton = new JButton("Generar Código y Guardar Compra");
        codigoLabel = new JLabel("Código de Compra: ");

        // Agregar componentes a la ventana
        add(new JLabel("Ingrese el precio:"));
        add(precioField);
        add(generarButton);
        add(codigoLabel);

        // Evento para el botón
        generarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precio = Double.parseDouble(precioField.getText());
                String codigoCompra = generarCodigoCompra();
                codigoLabel.setText("Código de Compra: " + codigoCompra);
                guardarCompraEnBD(codigoCompra, precio);
            }
        });

        // Conectar a la base de datos
        conectarBaseDeDatos();
    }

    // Método para generar un código único para la compra
    private String generarCodigoCompra() {
        Random rand = new Random();
        return "C" + (100000 + rand.nextInt(900000));
    }

    // Método para conectar a la base de datos
    private void conectarBaseDeDatos() {
        try {
            // Establecer la conexión con la base de datos (ajusta los datos de tu base de datos)
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "tu_contraseña");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar la compra en la base de datos
    private void guardarCompraEnBD(String codigoCompra, double precio) {
        try {
            // Crear la consulta SQL
            String query = "INSERT INTO compras (codigo_compra, precio) VALUES (?, ?)";

            // Preparar la sentencia SQL
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, codigoCompra);
            stmt.setDouble(2, precio);

            // Ejecutar la consulta
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Compra registrada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar la compra.");
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tienda tienda = new Tienda();
                tienda.setVisible(true);
            }
        });
    }
}
