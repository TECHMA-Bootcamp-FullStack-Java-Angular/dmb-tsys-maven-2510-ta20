package ejercicio_07;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejercicio_07 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			Ejercicio_07 window = new Ejercicio_07();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

	/**
	 * Create the application.
	 */
	public Ejercicio_07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 414, 168);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblCantidadCovertir = new JLabel("Cantidad a conavertir");
		lblCantidadCovertir.setBounds(68, 28, 123, 14);
		frame.getContentPane().add(lblCantidadCovertir);

		textField = new JTextField();
		textField.setBounds(201, 25, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		lblRes = new JLabel("");
		lblRes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRes.setBounds(111, 98, 170, 20);
		frame.getContentPane().add(lblRes);

		JButton btnEuPtas = new JButton("Euros -> Pesetas");
		btnEuPtas.setBounds(57, 64, 152, 23);
		frame.getContentPane().add(btnEuPtas);

		btnEuPtas.addActionListener(showPetas);

		JButton btnPtasEu = new JButton("Pesetas -> Euros");
		btnPtasEu.setBounds(229, 64, 133, 23);
		frame.getContentPane().add(btnPtasEu);
		btnPtasEu.addActionListener(showEuros);

	};

	ActionListener showEuros = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (!textField.getText().isEmpty()) {
				lblRes.setText(String.format("%.2f", Double.valueOf(textField.getText()) / 166.386) + " €.");
			} else {
				JOptionPane.showMessageDialog(null, "Debes colocar una divisa");
			}

		}
	};

	ActionListener showPetas = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (!textField.getText().isEmpty()) {
				lblRes.setText(String.format("%.2f", Double.valueOf(textField.getText()) * 166.386) + ".Ptas");
			} else {
				JOptionPane.showMessageDialog(null, "Debes colocar una divisa");
			}

		}
	};

}
