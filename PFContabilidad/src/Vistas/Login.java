/*Nuestra Ventana Login que sera la primera que se mostrara para el usuario*/
package Vistas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import Controller.MainControler;
import Modelos.UsuariosModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	
	private JTextField CajaPasswd;
	private JLabel LblTitulo;
	private JEditorPane JEditorAviso;
	private JLabel lblNombre;
	private JLabel LblPassword;
	private JButton BotonPasswd;
	
	JComboBox<String> comboBox ;
	
	public Login() {
		setLayout(null);
		//ETIQUETA TITULO
		LblTitulo = new JLabel("Control Personal de Contabilidad");
		LblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		LblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		LblTitulo.setForeground(Color.BLUE);
		LblTitulo.setBounds(10, 35, 448, 24);
		add(LblTitulo);
		
		//JEditor(Texto de Aviso)
		JEditorAviso = new JEditorPane();
		JEditorAviso.setEnabled(false);
		JEditorAviso.setEditable(false);
		JEditorAviso.setText("Aviso: Para la utilizacion de este programa de contabilidad es necesario Logearte. Los datos que aparecen en este programa estan compilados en una base de datos de la cual el propietario sera responsable de su uso.");
		JEditorAviso.setBackground(Color.DARK_GRAY);
		JEditorAviso.setForeground(Color.LIGHT_GRAY);
		JEditorAviso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JEditorAviso.setBounds(10, 70, 448, 56);
		add(JEditorAviso);
		
		//Etiqueta Nombre
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(10, 137, 162, 24);
		add(lblNombre);
		
		//Etiqueta Password
		LblPassword = new JLabel("Password");
		LblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LblPassword.setBounds(10, 198, 162, 24);
		add(LblPassword);
		
		//Caja Password
		CajaPasswd = new JTextField();
		CajaPasswd.setColumns(10);
		CajaPasswd.setBounds(10, 225, 162, 20);
		add(CajaPasswd);
		
		//Boton Password
		BotonPasswd = new JButton("Password");
		BotonPasswd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainControler.getInstance().logar();
			}
		});
		BotonPasswd.setBackground(new Color(192, 192, 192));
		BotonPasswd.setFont(new Font("Tahoma", Font.BOLD, 12));
		BotonPasswd.setBounds(296, 224, 162, 23);
		add(BotonPasswd);
		//Jcombobox
		comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 167, 162, 20);
		add(comboBox);
		
}	
	//Metodo para recojer los usuarios a traves de un iterator.
	public void cargaUsuarios(Iterator Objetoiterador){	
		comboBox.removeAllItems();
		while(Objetoiterador.hasNext()){
			comboBox.addItem((String)Objetoiterador.next());
		}
	}
}
	
