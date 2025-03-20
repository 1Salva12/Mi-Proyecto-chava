import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana1 extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Ventana1 frame = new Ventana1();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public Ventana1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 588, 207);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Etiqueta para el nombre de usuario
        JLabel lblNewLabel = new JLabel("Ingrese nombre de usuario:");
        lblNewLabel.setBounds(20, 21, 239, 14);
        contentPane.add(lblNewLabel);

        // Etiqueta para la clave
        JLabel lblNewLabel_1 = new JLabel("Ingrese clave:");
        lblNewLabel_1.setBounds(20, 61, 125, 14);
        contentPane.add(lblNewLabel_1);

        // Campo de texto para el nombre de usuario
        textField = new JTextField();
        textField.setBounds(214, 18, 225, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        // Campo de texto para la clave
        textField_1 = new JTextField();
        textField_1.setBounds(214, 58, 225, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        // Botón "Aceptar"
        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.setBounds(192, 115, 89, 23);
        contentPane.add(btnNewButton);

        // Acción para el botón "Aceptar"
        btnNewButton.addActionListener(e -> {
            String username = textField.getText();
            String password = textField_1.getText();
            System.out.println("Usuario: " + username);
            System.out.println("Clave: " + password);
        });

        // Botón "Cancelar"
        JButton btnNewButton_1 = new JButton("Cancelar");
        btnNewButton_1.setBounds(402, 115, 89, 23);
        contentPane.add(btnNewButton_1);

        // Acción para el botón "Cancelar"
        btnNewButton_1.addActionListener(e -> {
            System.exit(0); // Cerrar la aplicación
        });
    }
}

