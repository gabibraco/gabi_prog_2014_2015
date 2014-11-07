import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Actividad1 extends JFrame {
	
	//OBJETOS VENTANA
	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;
	private JButton Boton1;
	private JButton Boton2;
	private JButton Boton3;
	private JButton Boton4;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ARRANCAR VENTANA
					Actividad1 ventana = new Actividad1();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//FIN ARRANQUE VENTANA
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Actividad1() {
		
		//CARACTERISTICAS INICIAL VENTANA 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//CARACTERISTICAS CAJA1
		caja1 = new JTextField();
		caja1.setBounds(10, 22, 86, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		//CARACTERISTICAS CAJA4
		caja4 = new JTextField();
		caja4.setBounds(10, 192, 86, 20);
		contentPane.add(caja4);
		caja4.setColumns(10);
		
		//CARACTERISTICAS CAJA2
		caja2 = new JTextField();
		caja2.setBounds(338, 22, 86, 20);
		contentPane.add(caja2);
		caja2.setColumns(10);
		
		//CARACTERISTICAS CAJA3
		caja3 = new JTextField();
		caja3.setBounds(338, 192, 86, 20);
		contentPane.add(caja3);
		caja3.setColumns(10);
		
	
				
		//CARACTERISTICAS BOTON1
		Boton1 = new JButton("copiar");
		Boton1.setBounds(167, 21, 89, 23);
		contentPane.add(Boton1);
				
		//ACCION BOTON1
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Textocaja1=" ";
				Textocaja1 = caja1.getText();												
				caja2.setText(Textocaja1);
					
			}
		});
		
		//CARACTERISTICAS BOTON2
				Boton2 = new JButton("copiar");
				Boton2.setBounds(335, 106, 89, 23);
				contentPane.add(Boton2);
				
				//ACCION BOTON2
				Boton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String Textocaja2=" ";
						Textocaja2 = caja2.getText();															
						caja3.setText(Textocaja2);
								
					}
				});										
		
		//CARACTERISTICAS BOTON3
		Boton3 = new JButton("copiar");
		Boton3.setBounds(167, 191, 89, 23);
		contentPane.add(Boton3);
		
		//ACCION BOTON3
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Textocaja3=" ";
				Textocaja3 = caja3.getText();												
				caja4.setText(Textocaja3);
																
			}
		});
								
		//CARACTERISTICAS BOTON4
		Boton4 = new JButton("copiar");
		Boton4.setBounds(10, 106, 89, 23);
		contentPane.add(Boton4);
		
		//ACCION BOTON4
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Textocaja4=" ";
				Textocaja4 = caja4.getText();												
				caja1.setText(Textocaja4);
								
			}
		});
		
		
	}

}
