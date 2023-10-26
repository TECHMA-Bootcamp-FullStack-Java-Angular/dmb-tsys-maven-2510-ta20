package ejercicio_04;


import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio_04 {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_04 window = new Ejercicio_04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio_04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
				
		// Label Eventos
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(183, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setBounds(10, 38, 414, 212);
		frame.getContentPane().add(textArea);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(0, 44, 434, 217);
		frame.getContentPane().add(scroll);
		
		frame.addComponentListener(cA);
	}
	
	ComponentAdapter cA = new ComponentAdapter() {

	    public void componentResized(ComponentEvent e) {
	    	textArea.append("Me redimenensionaste\n");
	    }


	    public void componentMoved(ComponentEvent e) {
	    	textArea.append("Me moviste \n");
	    }


	    public void componentShown(ComponentEvent e) {
	    	textArea.append("Me mostraste \n");
	    }


	    public void componentHidden(ComponentEvent e) {
	    	textArea.append("Me oculataste \n");
	    }
	};
	

}
