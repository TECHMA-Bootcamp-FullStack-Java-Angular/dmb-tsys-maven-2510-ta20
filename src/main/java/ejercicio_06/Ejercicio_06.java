package ejercicio_06;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Ejercicio_06 {

	private JFrame frmEjercicio;
	private JButton btnCalcualar;
	private JTextField textAltura;
	private JTextField textPeso;
	private JLabel lblres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ejercicio_06 window = new Ejercicio_06();
			window.frmEjercicio.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the application.
	 */
	public Ejercicio_06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmEjercicio = new JFrame();
		frmEjercicio.setType(Type.UTILITY);
		frmEjercicio.setResizable(false);
		frmEjercicio.setTitle("Ejercicio 6");
		frmEjercicio.setBounds(100, 100, 420, 160);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		frmEjercicio.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Altura en (metros)");
		lblNewLabel.setBounds(20, 34, 104, 14);
		frmEjercicio.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Peso (Kg)");
		lblNewLabel_1.setBounds(227, 34, 73, 14);
		frmEjercicio.getContentPane().add(lblNewLabel_1);

		// Label resultado
		lblres = new JLabel("");
		lblres.setForeground(new Color(128, 128, 0));
		lblres.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblres.setBounds(243, 82, 57, 14);
		frmEjercicio.getContentPane().add(lblres);

		// Label IMC
		JLabel lblNewLabel_3 = new JLabel("IMC");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(208, 82, 36, 14);
		frmEjercicio.getContentPane().add(lblNewLabel_3);

		// Impunt altura
		textAltura = new JTextField();
		textAltura.setBounds(128, 31, 86, 20);
		frmEjercicio.getContentPane().add(textAltura);
		textAltura.setColumns(10);

		// Impunt peso
		textPeso = new JTextField();
		textPeso.setBounds(287, 31, 86, 20);
		frmEjercicio.getContentPane().add(textPeso);
		textPeso.setColumns(10);

		// Button Calcaular IMC ->
		btnCalcualar = new JButton("Calcaular IMC");
		btnCalcualar.setBounds(81, 79, 117, 23);
		frmEjercicio.getContentPane().add(btnCalcualar);
		btnCalcualar.addActionListener(showIMC);

	};

	ActionListener showIMC = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			if (textPeso.getText().isEmpty() || textAltura.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes colocar tu peso y tu altura");
			} else {
				lblres.setText(calcularIMC());
			}
		}

	};

	private String calcularIMC() {
		return String.format("%.2f", Double.valueOf(textPeso.getText()) / (Double.valueOf(textAltura.getText()) * 2));
	};

}
