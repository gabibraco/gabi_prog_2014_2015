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
import java.awt.Color;
import javax.swing.DropMode;
import java.awt.Font;


public class VentanaConversor extends JFrame {
	private JTextField Caja1;
	private JLabel EtiquetaEuros;
	private JTextField Caja2;
	private JLabel Etiquetadolares;
	private JTextField Caja3;
	private JLabel lblNewLabel;


	/**
	 * Create the frame.
	 */
	public VentanaConversor(float valorConversion) {
				
		
		//Definimos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 237);
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
		Etiquetadolares.setBounds(10, 95, 86, 20);
		contentPane.add(Etiquetadolares);
		
		//Etiqueta Euros
		EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setBounds(10, 36, 86, 20);
		contentPane.add(EtiquetaEuros);
		
		//Caja2
		Caja2 = new JTextField();
		Caja2.setColumns(10);
		Caja2.setBounds(10, 116, 86, 20);
		contentPane.add(Caja2);
		
		//Boton Conversor
		JButton btnNewButton = new JButton("Conversor");
		btnNewButton.setBounds(117, 115, 111, 23);
		contentPane.add(btnNewButton);
		
		//Etiqueta de mensaje
		JLabel Mensaje = new JLabel("Menasaje de Control");
		Mensaje.setBounds(10, 148, 218, 14);
		contentPane.add(Mensaje);
		
		//caja3( mensaje de texto)
		Caja3 = new JTextField();
		Caja3.setForeground(Color.RED);
		Caja3.setEditable(false);
		Caja3.setBounds(10, 173, 285, 20);
		contentPane.add(Caja3);
		Caja3.setColumns(10);
		
		lblNewLabel = new JLabel("CONVERSOR DE EUROS ENTRE 0 Y 500");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 11, 285, 14);
		contentPane.add(lblNewLabel);
		
		//Accion del Boton
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
								
				try{
				euros=Float.parseFloat(Caja1.getText());
				Caja2.setText(String.valueOf(euros*valorConversion));
				Caja3.setText(String.valueOf(euros));
				if(euros<=500 && euros>0 ){
				
					Caja3.setText("Todo ok");}
					else{
						Caja2.setText("");
						Caja3.setText("Los euros deben estar entre 0 y 500");}
					}
					
				catch(Exception e){	
					Caja2.setText("");
					Caja3.setText("se ha prodcucido un erros de conversion");}
				
				
				
				
				
				
				
			}
		});
		
	}
}
