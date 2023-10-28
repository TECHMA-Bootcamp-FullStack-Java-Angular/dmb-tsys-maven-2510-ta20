package ejercicio_03;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_03 {

	private JFrame frmEjercicio;
	private JLabel lblBtn1;
	private JLabel lblBtn2;
	private JButton btn1;
	private JButton btn2;
	private int counterBtn1 = 0;
	private int counterBtn2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			Ejercicio_03 window = new Ejercicio_03();
			window.frmEjercicio.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the application.
	 */
	public Ejercicio_03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setType(Type.UTILITY);
		frmEjercicio.setResizable(false);
		frmEjercicio.setTitle("Ejercicio 3");
		frmEjercicio.setBounds(100, 100, 311, 132);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		frmEjercicio.setLocationRelativeTo(null);

		// Label Button 1
		lblBtn1 = new JLabel("Boton 1:  0 veces");
		lblBtn1.setBounds(33, 28, 111, 14);
		frmEjercicio.getContentPane().add(lblBtn1);

		// Label Button 2
		lblBtn2 = new JLabel("Boton 2: 0 veces");
		lblBtn2.setBounds(180, 28, 105, 14);
		frmEjercicio.getContentPane().add(lblBtn2);

		// Boton 1 -> changeTextBtn1
		btn1 = new JButton("Boton 1");
		btn1.setBounds(33, 53, 89, 23);
		frmEjercicio.getContentPane().add(btn1);
		btn1.addActionListener(changeTextBtn1);

		// Boton 1 -> changeTextBtn2
		btn2 = new JButton("Boton 2");
		btn2.setBounds(180, 53, 89, 23);
		frmEjercicio.getContentPane().add(btn2);
		btn2.addActionListener(changeTextBtn2);

	};

	ActionListener changeTextBtn1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setCounterBtn1(getCounterBtn1() + 1);
			lblBtn1.setText("Boton 1: " + getCounterBtn1() + " veces");

		}
	};

	ActionListener changeTextBtn2 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setCounterBtn2(getCounterBtn2() + 1);
			lblBtn2.setText("Boton 2: " + getCounterBtn2() + " veces");
		}
	};

	public int getCounterBtn1() {
		return counterBtn1;
	}

	public int getCounterBtn2() {
		return counterBtn2;
	}

	public void setCounterBtn1(int counterBtn1) {
		this.counterBtn1 = counterBtn1;
	}

	public void setCounterBtn2(int counterBtn2) {
		this.counterBtn2 = counterBtn2;
	}

}
