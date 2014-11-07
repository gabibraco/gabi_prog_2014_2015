import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame {
	private JTextField Caja1;
	private JLabel EtiquetaEuros;
	private JTextField Caja2;
	private JLabel Etiquetadolares;


	/**
	 * Create the frame.
	 */
	public VentanaConversor(float valorConversion) {
				
		
		//Definimos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja1 
		Caja1 = new JTextField();
		Caja1.setBounds(10, 51, 86, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		//Etiqueta Dolares
		Etiquetadolares = new JLabel("Dolares");
		Etiquetadolares.setBounds(10, 26, 86, 20);
		contentPane.add(Etiquetadolares);
		
		//Etiqueta Euros
		EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setBounds(10, 93, 86, 20);
		contentPane.add(EtiquetaEuros);
		
		//Caja2
		Caja2 = new JTextField();
		Caja2.setColumns(10);
		Caja2.setBounds(10, 116, 86, 20);
		contentPane.add(Caja2);
		
		//Boton Conversor
		JButton btnNewButton = new JButton("Conversor");
		btnNewButton.setBounds(100, 79, 111, 23);
		contentPane.add(btnNewButton);
		
		//Accion del Boton
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros=Float.parseFloat(Caja1.getText());
				Caja2.setText(String.valueOf(euros*valorConversion));
				
			}
		});
		
	}
}
