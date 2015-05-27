package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import Controlador.MainControler;

public class VistaJuegos extends JPanel {
	//DEFINICION DE VARIABLES
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblPlataforma;
	private JLabel lblFiltros;
	private JButton btnEditar;
	private	JTextField CajaNom;
	private JComboBox comboBoxGen;
	private JComboBox comboBoxPlat;
	private JLabel lblNombre2;
	private JTextField CajaNom2;
	private JLabel lblGenero2; 
	private JTextField CajaGen2; 
	private JLabel Plataforma2;
	private JTextField CajaPlataforma;
	private JButton btnSalvar; 
	
	public VistaJuegos() {
		
		setLayout(null);
		
		//ETIQUETAFILTROS
		lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(25, 11, 100, 21);
		add(lblFiltros);
		
		//ETIQUETA NOMBRE
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(49, 43, 94, 14);
		add(lblNombre);
		
		//ETIQUETA GENERO
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(177, 43, 100, 14);
		add(lblGenero);
		
		//ETIQUETA PLATAFORMA
		lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(300, 43, 100, 14);
		add(lblPlataforma);
		
		//CAJA NOMBRE
		CajaNom = new JTextField();
		CajaNom.setBounds(49, 68, 94, 20);
		add(CajaNom);
		CajaNom.setColumns(10);
		
		//COMBOBOX GENERO
		comboBoxGen = new JComboBox();
		comboBoxGen.setBounds(177, 68, 100, 20);
		add(comboBoxGen);
		
		//COMBOBOX PLATAFORMA
		comboBoxPlat = new JComboBox();
		comboBoxPlat.setBounds(300, 68, 100, 20);
		add(comboBoxPlat);
		
		//ETIQUETA NOMBRE2
		lblNombre2 = new JLabel("Nombre");
		lblNombre2.setBounds(249, 99, 76, 14);
		add(lblNombre2);
		
		//CAJA NOMBRE2
		CajaNom2 = new JTextField();
		CajaNom2.setEditable(false);
		CajaNom2.setBounds(249, 113, 151, 20);
		add(CajaNom2);
		CajaNom2.setColumns(10);
		
		//ETIQUETA GENERO2
		lblGenero2 = new JLabel("Genero");
		lblGenero2.setBounds(249, 144, 76, 14);
		add(lblGenero2);
		
		//CAJA GENERO2
		CajaGen2 = new JTextField();
		CajaGen2.setEditable(false);
		CajaGen2.setColumns(10);
		CajaGen2.setBounds(249, 158, 151, 20);
		add(CajaGen2);
		
		//ETIQUETAPLATAFORMA2
		Plataforma2 = new JLabel("Plataforma");
		Plataforma2.setBounds(249, 189, 76, 14);
		add(Plataforma2);
		
		//CAJA PLATAFORMA
		CajaPlataforma = new JTextField();
		CajaPlataforma.setEditable(false);
		CajaPlataforma.setColumns(10);
		CajaPlataforma.setBounds(249, 202, 151, 21);
		add(CajaPlataforma);
		
		//BOTON EDITAR
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(249, 234, 151, 23);
		add(btnEditar);
		
		//BOTON SALVAR
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(249, 268, 151, 23);
		add(btnSalvar);
		
	}
}
