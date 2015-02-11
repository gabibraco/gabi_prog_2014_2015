import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class ConversorMonedas extends JFrame {
	
	//Declaracion del tipo de objetos que tenemos en la ventana
	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JButton boton;
	private	JComboBox moneda;
	private JLabel Etiquetamensaje;
	
	//Datos de monedas, hace referencia a clase DatosGenerales
	DatosGenerales datos=new DatosGenerales();
				
	//Seleccion de monedas y la inicializamos con un valor.
	private float valorMonedaSelecc=0f;
			
	/**
	 * Create the frame.
	 */
	public ConversorMonedas() {
	
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
		EtiquetaInicio.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		EtiquetaInicio.setForeground(new Color(0, 0, 139));
		EtiquetaInicio.setBounds(10, 11, 414, 22);
		contentPane.add(EtiquetaInicio);
		
		//Etiqueta Euros
		JLabel EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setFont(new Font("Calibri", Font.BOLD, 12));
		EtiquetaEuros.setBounds(10, 44, 95, 16);
		contentPane.add(EtiquetaEuros);
		
		//Caja Euros
		caja1 = new JTextField();
		caja1.setBounds(10, 69, 126, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		// Características Físicas del comboBox.
		moneda = new JComboBox();
		moneda.setBounds(10, 100, 126, 20);
		contentPane.add(moneda);
		
		//Realizamos el bucle con for para la seleccion de los item
		for(int i=0;i<datos.getMonedas().length;i++){
			moneda.addItem((String)datos.getMonedas()[i]);
		}
		
		//Acción ComBox.
		moneda.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {	
				
			//Selección de Items y ponerlos en caja3
				caja3.setText("SELECCIONADA LA MONEDA:"+moneda.getSelectedItem());
				
				//Comparacion y introduccion de datos desde DatosGenerales a traves
				//de metodos publicos que nos devuelven el contenido de los Arrays
				switch((String)moneda.getSelectedItem() ){
				case DatosGenerales.MONEDA_DOL:
					valorMonedaSelecc=datos.getValoresAEuros()[0];		  
				break;
				case DatosGenerales.MONEDA_EUR:
					valorMonedaSelecc=datos.getValoresAEuros()[1];		  
				break;
				case DatosGenerales.MONEDA_LIB:
					valorMonedaSelecc=datos.getValoresAEuros()[2];		  
				break;
				case DatosGenerales.MONEDA_YEN:
					valorMonedaSelecc=datos.getValoresAEuros()[3];
				default:
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
		boton.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton.setBounds(169, 128, 118, 23);
		contentPane.add(boton);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		//  Definimos la variable euros y le decimos que intente(try)
		//  hacer toda esta seleccion y sino es posible nos muestre 
		//  en caja3 el correspondiente mensaje de error.					
			try{
				float euros;
				euros=Float.parseFloat(caja1.getText());
				caja3.setText(String.valueOf(euros));
		//Condicion para la accion.		
			if(euros<=500 && euros>0  )	{
				caja2.setText(String.valueOf(euros*valorMonedaSelecc));
			    caja3.setText("Todo ok");					
		//Seleccion de variable a transformar en caja2.			
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
		Etiquetamensaje.setFont(new Font("Calibri", Font.BOLD, 12));
		Etiquetamensaje.setBounds(10, 167, 290, 22);
		contentPane.add(Etiquetamensaje);
		
		//Caja3 mensaje.
		caja3 = new JTextField();
		caja3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		caja3.setEditable(false);
		caja3.setForeground(Color.RED);
		caja3.setBounds(10, 195, 414, 22);
		contentPane.add(caja3);
		caja3.setColumns(10);	
		
	}
}
