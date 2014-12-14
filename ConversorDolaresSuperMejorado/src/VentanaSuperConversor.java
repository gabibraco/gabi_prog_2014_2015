import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class VentanaSuperConversor extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JButton boton;
	private	JComboBox comboBox;
	private JLabel Etiquetamensaje;
	
	
	
	public VentanaSuperConversor() {
		float valorDolares=0.75f;
		float valorLibras=1.5f;
		float valorYen=2.1f;
	
		
		//Caracteristicas Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta Inicio
		JLabel EtiquetaInicio = new JLabel("INTRODUCIR UN VALOR EN EUROS ENTRE 0 Y 500");
		EtiquetaInicio.setFont(new Font("Calibri", Font.BOLD, 14));
		EtiquetaInicio.setForeground(Color.BLACK);
		EtiquetaInicio.setBounds(10, 11, 414, 22);
		contentPane.add(EtiquetaInicio);
		
		//Etiqueta Euros
		JLabel EtiquetaEuros = new JLabel("EUROS");
		EtiquetaEuros.setFont(new Font("Calibri", Font.BOLD, 12));
		EtiquetaEuros.setBounds(10, 44, 95, 16);
		contentPane.add(EtiquetaEuros);
		
		//Caja Euros
		caja1 = new JTextField();
		caja1.setBounds(10, 69, 126, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		// Caracteristicas Fisicas del comboBox.
		comboBox = new JComboBox();
		comboBox.setBounds(10, 100, 126, 20);
		contentPane.add(comboBox);
		
		//Elementos del comboBox
			//Array
		
		String monedas[]=new String[3];
		monedas[0]="Dolares";
		monedas[1]="Libras";
		monedas[2]="Yen";
		comboBox.addItem(monedas[0]);
		comboBox.addItem(monedas[1]);
		comboBox.addItem(monedas[2]);
		
		//Acción ComBox.
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
			//Selección de Items.
				switch((String)comboBox.getSelectedItem())
				
				{
				case "Dolares":
					monedas[0]=String.valueOf(valorDolares);
					caja3.setText("Seleccionada la moneda:Dolares");
					break;
				case "Libras":
					monedas[1]=String.valueOf(valorLibras);
					caja3.setText("Seleccionada la moneda:Libras");
					break;
				case "Yen":
					monedas[2]=String.valueOf(valorYen);
					caja3.setText("Seleccionada la moneda:Yen");
					break;
				default:
					caja3.setText("");
					break;
			   }
				
			}
		});
		
		//Características de caja2.
		caja2 = new JTextField();
		caja2.setBounds(10, 131, 126, 20);
		contentPane.add(caja2);
		caja2.setColumns(10);
		
		//Botón convertir.
		boton = new JButton("Convertir");
		boton.setBounds(169, 128, 118, 23);
		contentPane.add(boton);
		
		//Acción Botón Convertir.
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//*  Definimos la variable euros y le decimos que intente(try)
//*  hacer toda esta seleccion y sino es posible nos muestre 
//*  en caja3 el correspondiente mensaje de error.
				float euros;
				
				try{
					euros=Float.parseFloat(caja1.getText());
					caja3.setText(String.valueOf(euros));
		//Condicion para la accion.		
				if(euros<=500 && euros>0  )	{
					caja2.setText(String.valueOf(euros*valorDolares));
					caja3.setText("Todo ok");
				
					
		//Seleccion de variable a transformar en caja2.			
				switch((String)comboBox.getSelectedItem() ){
					case "Dolares":
						caja2.setText(String.valueOf(euros*valorDolares));
						caja3.setText("Todo ok");
						break;
					case "Libras":
						caja2.setText(String.valueOf(euros*valorLibras));
						caja3.setText("Todo ok");
						break;
					case "Yen":
						caja2.setText(String.valueOf(euros*valorYen));
						caja3.setText("Todo ok");
						break;
					default:
						break;
					}
				}
				
				else{
					caja2.setText("");
					caja3.setText("Los euros deben estar entre 0 y 500");
							
						}
					}
				catch(Exception e){	
					caja2.setText("");
					caja3.setText("Se ha prodcucido un error de conversion");}
				
			}
		});
		
		//Etiqueta Mensaje.
		Etiquetamensaje = new JLabel("Mensaje Control");
		Etiquetamensaje.setFont(new Font("Calibri", Font.BOLD, 14));
		Etiquetamensaje.setBounds(10, 167, 290, 22);
		contentPane.add(Etiquetamensaje);
		
		//Caja3 mensaje.
		caja3 = new JTextField();
		caja3.setForeground(Color.RED);
		caja3.setBounds(10, 195, 414, 22);
		contentPane.add(caja3);
		caja3.setColumns(10);
		
		
		
		
		
		
		
		
	}
}
