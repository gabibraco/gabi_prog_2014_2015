import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class VentanaSuperConversorV extends JFrame {

	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField Caja2;
	private JTextField Caja3;
	private JLabel Inicio;
	private JLabel EtiquetaEuros;
	private JComboBox Seleccion;
	private JLabel Mensaje;
	private JButton BotonConversor;
	private float ValorConversionPasado;
	private String TextoConversion[]={"Dolares","Libras","Yen"};
	private float ValoresConversion[]={0.75f,1.5f,2.1f};

	public VentanaSuperConversorV(float ValorConversion){
		ValorConversionPasado=ValorConversion;
		
		//Caracteristicas de la Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cracrteristicas de Etiqueta inicio
		Inicio = new JLabel("Introducir un Valor entre 0 y 500 Euros");
		Inicio.setForeground(Color.BLUE);
		Inicio.setFont(new Font("Calibri", Font.BOLD, 14));
		Inicio.setBounds(10, 22, 414, 22);
		contentPane.add(Inicio);
		
		//Etiqueta Euros
		EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setFont(new Font("Tahoma", Font.BOLD, 12));
		EtiquetaEuros.setBounds(10, 55, 46, 14);
		contentPane.add(EtiquetaEuros);
		
		//Caja texto 1 ( Caracteristicas)
		Caja1 = new JTextField();
		Caja1.setBounds(10, 80, 136, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		//ComboBox Seleccion 
		Seleccion = new JComboBox();
		Seleccion.setBounds(10, 124, 136, 20);
		contentPane.add(Seleccion);
		//Elementos del ComboBox
		Seleccion.addItem(TextoConversion[0]);
		Seleccion.addItem(TextoConversion[1]);
		Seleccion.addItem(TextoConversion[2]);
		Seleccion.setSelectedItem("Dolares");
		
		
		//Accion del ComboBox
		Seleccion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
		//Seleccion de Item
				Mensaje.setText("SELECCIONADA LA MONEDA:"+Seleccion.getSelectedItem());
				}
	
		});
		
		//Caja texto 2 (Caracteristicas)
		Caja2 = new JTextField();
		Caja2.setBounds(10, 172, 136, 20);
		contentPane.add(Caja2);
		Caja2.setColumns(10);
		
		//Boton Convertir
		BotonConversor = new JButton("Convertir");
		BotonConversor.setBounds(174, 171, 89, 23);
		contentPane.add(BotonConversor);
		
		//Accion del Boton Convertir
		BotonConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		//*  Definimos la variable euros y le decimos que intente(try)
		//*  hacer toda esta seleccion y sino es posible nos muestre 
		//*  en caja3 el correspondiente mensaje de error.
			float euros;					
			try{
				euros=Float.parseFloat(Caja1.getText());
				Caja3.setText(String.valueOf(euros));
		//Condicion para la accion.		
			if(euros<=500 && euros>0  )	{
				Caja2.setText(String.valueOf(euros*ValorConversionPasado));
			    Caja3.setText("Todo ok");
									
		//Seleccion de variable a transformar en caja2.			
			switch((String)Seleccion.getSelectedItem() ){
			case "Dolares":
				ValorConversionPasado=ValoresConversion[0];		  
			break;
			case "Libras":
				ValorConversionPasado=ValoresConversion[1];		  
			break;
			case "Yen":
				ValorConversionPasado=ValoresConversion[2];		  
			break;
			default:
			break;
					}
			}					
			else{
				Caja2.setText("");
				Caja3.setText("Los euros deben estar entre 0 y 500");							
				}
			}
			catch(Exception e){	
				Caja2.setText("");
				Caja3.setText("Se ha prodcucido un error de conversion");}				
				}
			});

		//Etiqueta Mensaje Control
		Mensaje = new JLabel("Mensaje Control");
		Mensaje.setForeground(Color.BLUE);
		Mensaje.setFont(new Font("Calibri", Font.BOLD, 14));
		Mensaje.setBounds(10, 203, 414, 18);
		contentPane.add(Mensaje);
		
		//Caja Texto 3 (Caracteristicas)
		Caja3 = new JTextField();
		Caja3.setEditable(false);
		Caja3.setForeground(Color.RED);
		Caja3.setBounds(10, 232, 414, 20);
		contentPane.add(Caja3);
		Caja3.setColumns(10);
	}
}
