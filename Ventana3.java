import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel_2; // Declaración de lblNewLabel_2 como campo de clase

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana3 frame = new Ventana3();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Ventana3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 641, 357);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Ingrese el primer valor ");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel.setBounds(133, 74, 215, 17);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Ingrese el segundo valor");
        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(133, 143, 210, 14);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(358, 71, 210, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(358, 140, 210, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        // Crear botón para sumar
        JButton btnNewButton = new JButton("Sumar");
        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener valores, realizar suma y actualizar el resultado
                int v1 = Integer.parseInt(textField.getText());
                int v2 = Integer.parseInt(textField_1.getText());
                int suma = v1 + v2;
                lblNewLabel_2.setText(String.valueOf(suma));
            }
        });
        btnNewButton.setBounds(220, 234, 89, 23);
        contentPane.add(btnNewButton);

        // Etiqueta de resultado
        lblNewLabel_2 = new JLabel("Resultado");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(459, 238, 70, 14);
        contentPane.add(lblNewLabel_2);
    }
}

