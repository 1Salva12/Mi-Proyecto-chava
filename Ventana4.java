import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane; // Declaración de contentPane

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana4 frame = new Ventana4();
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
    public Ventana4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        // Inicializar contentPane
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Diseño libre
        setContentPane(contentPane); // Asignar contentPane como contenido principal

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        menuBar.setToolTipText("Cambiar el color de fondo");
        setJMenuBar(menuBar);

        // Menú principal
        JMenu mnNewMenu = new JMenu("Cambiar de color");
        menuBar.add(mnNewMenu);

        // Opción: Rojo
        JMenuItem mntmNewMenuItem = new JMenuItem("Rojo");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.RED); // Cambiar color de fondo a rojo
            }
        });
        mnNewMenu.add(mntmNewMenuItem);

        // Opción: Verde
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Verde");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.GREEN); // Cambiar color de fondo a verde
            }
        });
        mnNewMenu.add(mntmNewMenuItem_1);

        // Opción: Azul
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Azul");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.BLUE); // Cambiar color de fondo a azul
            }
        });
        mnNewMenu.add(mntmNewMenuItem_2);
    }
}

