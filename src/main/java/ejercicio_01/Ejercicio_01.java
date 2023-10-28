package ejercicio_01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Ejercicio_01 {

	private JFrame frmEjercicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			Ejercicio_01 window = new Ejercicio_01();
			window.frmEjercicio.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the application.
	 */
	public Ejercicio_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmEjercicio = new JFrame();
		frmEjercicio.setTitle("Ejercicio 1");
		frmEjercicio.setBounds(100, 100, 348, 96);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Hola, soy una Venatana Dimensionable");
		lblNewLabel.setForeground(new Color(153, 0, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmEjercicio.getContentPane().add(lblNewLabel, BorderLayout.CENTER);

		frmEjercicio.setLocationRelativeTo(null);
	}

}
