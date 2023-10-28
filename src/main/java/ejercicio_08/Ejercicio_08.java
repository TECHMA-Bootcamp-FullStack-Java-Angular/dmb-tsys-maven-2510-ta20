package ejercicio_08;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_08 {

	private JFrame frame;
	private static JTextField ImputMoney;
	private static JLabel lblResult;
	private static JButton btnCalcualtor;
	private static JButton btnChanging;
	private static JButton btnClean;
	private boolean euros = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ejercicio_08 window = new Ejercicio_08();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

	/**
	 * Create the application.
	 */
	public Ejercicio_08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 412, 132);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(24, 21, 119, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(249, 21, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);

		ImputMoney = new JTextField();
		ImputMoney.setBounds(153, 18, 86, 20);
		frame.getContentPane().add(ImputMoney);
		ImputMoney.setColumns(10);

		lblResult = new JLabel("0.0");
		lblResult.setBounds(310, 21, 78, 14);
		frame.getContentPane().add(lblResult);

		btnCalcualtor = new JButton("Ptas a Euros");
		btnCalcualtor.addActionListener(calculator);
		btnCalcualtor.setBounds(24, 46, 129, 23);
		frame.getContentPane().add(btnCalcualtor);

		btnChanging = new JButton("Cambiar");
		btnChanging.addActionListener(Fnchanging);
		btnChanging.setBounds(173, 46, 89, 23);
		frame.getContentPane().add(btnChanging);

		btnClean = new JButton("Borrar");
		btnClean.addActionListener(clearInput);
		btnClean.setBounds(274, 46, 89, 23);
		frame.getContentPane().add(btnClean);

	}

	ActionListener clearInput = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			lblResult.setText("0.0");
			ImputMoney.setText("");
		}
	};

	ActionListener Fnchanging = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setEuros(!euros);
			btnCalcualtor.setText(isEuros() ? "Ptas a Euros" : "Euros a Ptas.");
		}
	};

	ActionListener calculator = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if (ImputMoney.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes colocar una divisa");
			}

			if (euros && !ImputMoney.getText().isEmpty()) {

				lblResult.setText(String.format("%.2f", Double.valueOf(ImputMoney.getText()) / 166.386) + " €.");
			}

			if (!euros && !ImputMoney.getText().isEmpty()) {

				lblResult.setText(String.format("%.2f", Double.valueOf(ImputMoney.getText()) * 166.386) + " Ptas.");
			}

		}
	};

	public boolean isEuros() {
		return euros;
	}

	public void setEuros(boolean euros) {
		this.euros = euros;
	}

}
