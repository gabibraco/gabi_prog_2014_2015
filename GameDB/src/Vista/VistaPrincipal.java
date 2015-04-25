package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import java.util.ArrayList;
import java.awt.Font;
import java.util.Iterator;



import Modelo.UsuariosModel;

public class VistaPrincipal extends JPanel {
	
	//Definicion de variables.
	private JPanel Principal;
	private JTextField textField;
	private JLabel lblAvatar;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField CajaContraseña;
	private JButton btnJuegos;
	private JButton btnPerfil;
	private JComboBox<String> comboBox;
	private JButton btnLogIn;
	private JButton btnRegistrarse;
	UsuariosModel Usuarios;
	
	
	
	public VistaPrincipal() {
		setLayout(null);
		
		//Imagen
		lblAvatar = new JLabel("Avatar");
		lblAvatar.setIcon(new ImageIcon("C:\\Users\\Gabi\\Desktop\\icono.png"));//imagen
		lblAvatar.setBounds(22, 11, 141, 140);
		add(lblAvatar);
		
		//Etiqueta Usuario
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(22, 173, 150, 19);
		add(lblUsuario);
		
		//Etiqueta contraseña
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(22, 234, 150, 14);
		add(lblContrasea);
		
		//caja contraseña
		CajaContraseña = new JTextField();
		CajaContraseña.setBounds(22, 259, 150, 20);
		add(CajaContraseña);
		CajaContraseña.setColumns(10);
		
		//Boton juegos
		btnJuegos = new JButton("Juegos>");
		btnJuegos.setBounds(208, 36, 160, 23);
		add(btnJuegos);
		
		//Boton Perfil
		btnPerfil = new JButton("Perfil>");
		btnPerfil.setBounds(208, 70, 160, 23);
		add(btnPerfil);
		
		//creacion JcomboBox
		comboBox = new JComboBox<String>();
		comboBox.setBounds(22, 203, 150, 20);
		add(comboBox);
		
		//Boton Login sin accion
		btnLogIn = new JButton("LogIn");
		btnLogIn.setForeground(Color.GRAY);
		btnLogIn.setEnabled(false);
		btnLogIn.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnLogIn.setBounds(22, 314, 150, 23);
		add(btnLogIn);
		
		//Boton Registrarse sin accion
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setEnabled(false);
		btnRegistrarse.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnRegistrarse.setBounds(22, 355, 150, 23);
		add(btnRegistrarse);
		
		//Inserccion de los items en el comboBox por medio del iterador que nos lo rellenara
			Usuarios=new UsuariosModel();
			Iterator<String>ITusuario=Usuarios.getUsuarios().iterator();
		
			while(ITusuario.hasNext()){
				comboBox.addItem((String)ITusuario.next());
			}
		
	}
}
