package ejercicio_02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_02 {

	private JFrame frmEjercicio;
	private JButton btn1;
	private JButton btn2;
	private JLabel lblres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_02 window = new Ejercicio_02();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio_02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmEjercicio = new JFrame();
		frmEjercicio.setType(Type.UTILITY);
		frmEjercicio.setTitle("Ejercicio 2");
		frmEjercicio.setBounds(100, 100, 399, 124);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);

		// Label: Pulsa un boton
		lblres = new JLabel("Pulsa un boton");
		lblres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblres.setBounds(23, 39, 154, 14);
		frmEjercicio.getContentPane().add(lblres);

		btn1 = new JButton("Boton 1");
		btn1.setBounds(187, 36, 89, 23);
		frmEjercicio.getContentPane().add(btn1);

		btn2 = new JButton("Boton 2");
		btn2.setBounds(284, 36, 89, 23);
		frmEjercicio.getContentPane().add(btn2);

		btn1.addActionListener(aLbnb1);
		btn2.addActionListener(aLbnb2);
		
		frmEjercicio.setLocationRelativeTo(null);

	};

	ActionListener aLbnb1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			lblres.setText("Has pulaso el boton 1");
		}
	};

	ActionListener aLbnb2 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			lblres.setText("Has pulaso el boton 2");
		}
	};
}
