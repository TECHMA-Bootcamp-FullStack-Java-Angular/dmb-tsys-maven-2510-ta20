package ejercicio_05;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Ejercicio_05 {

	private JFrame frmEjercicio;
	private JButton btn;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			Ejercicio_05 window = new Ejercicio_05();
			window.frmEjercicio.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the application.
	 */
	public Ejercicio_05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setResizable(false);
		frmEjercicio.setTitle("Ejercicio 5");
		frmEjercicio.setBounds(100, 100, 450, 302);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmEjercicio.setLocationRelativeTo(null);
		
		textArea = new JTextArea();
		textArea.setBounds(1, 1, 432, 33);
		frmEjercicio.getContentPane().add(textArea);
		textArea.addMouseListener(mA);
		textArea.addKeyListener(kL);
		frmEjercicio.getContentPane().setLayout(null);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(0, 44, 434, 217);
		frmEjercicio.getContentPane().add(scroll);
		
		// Button Limpiar -> clearArea
		btn = new JButton("Limpiar");
		btn.setBounds(166, 10, 89, 23);
		frmEjercicio.getContentPane().add(btn);
		btn.addActionListener(clearArea);
	};
	
	
	
	ActionListener clearArea = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
		}
	};
	
	KeyListener kL = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			textArea.append(" Apretaste una tecla\n");
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			textArea.append(" Tecla liberada\n");
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			textArea.append(" Presionaste una tecla\n");
			
		}
	};
	
	MouseAdapter mA = new MouseAdapter() {
	
		@Override
        public void mouseClicked(MouseEvent e) {
        	textArea.append("Hiciste clic en el area\n");
        }

		@Override
        public void mousePressed(MouseEvent e) {
        	textArea.append("Presinaste el taton\n");
        }

		@Override
        public void mouseReleased(MouseEvent e) {
        	textArea.append("Dejaste de presionar el raton\n");
        }

		@Override
        public void mouseEntered(MouseEvent e) {
        	textArea.append("El raton está dentro de text area\n");
        }

		@Override
        public void mouseExited(MouseEvent e) {
        	textArea.append("El ratón está fuera de text area\n");
        }
		
	};
	
}
	
	
