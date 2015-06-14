/*Este sera nuestro content panel que contendra las diferentes ventanas de nuestro
 * proyecto.*/


package Vistas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelos.ModeloGastos;
import Modelos.ObjGastos;
import Modelos.ObjetoPerfil;
import Vistas.Login;
import Controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Inicio extends JFrame {
	
	//Definicion de variables
	private JPanel contentPane;
	private JTextField textField;
	private Login Login;
	private Perfil Perfil;
	private Gastos Gastos;
	private Ingresos Ingresos;
	private JPanel Ventanas;
	private JMenuItem mntmIngresos;
	private JMenu mnIngresos;
	private JMenu mnGatos;
	private JMenu mnPerfil;
	private JMenu mnNewMenu;
	private JMenuBar menuBar;
	//Instancia unica		
	private static Inicio instance = null;
	
	
	public Inicio() {
		//Caracteristicas de nuestro Contenedor
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		
		//Insertamos el menu
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Menu Login
		mnNewMenu = new JMenu("Login");
		menuBar.add(mnNewMenu);
		
		//Insertamos el Item(Login)
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().showVistasLogin();
			}
		});
		mnNewMenu.add(mntmLogin);
		
		//Menu Perfil
		mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		//Insertamos el Item(Perfil)
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showVistasPerfil();
			}
		});
		mnPerfil.add(mntmPerfil);
		
		//Menu Gastos
		mnGatos = new JMenu("Gastos");
		menuBar.add(mnGatos);
		
		//Insertamos el Item(Gastos)
		JMenuItem mntmGastos = new JMenuItem("Gastos");
		mntmGastos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showVistasGastos();
			}
		});
		mnGatos.add(mntmGastos);
		
		//Menu Ingresos
		mnIngresos = new JMenu("Ingresos");
		menuBar.add(mnIngresos);
		
		//Insertamos el Item(Ingresos)
		mntmIngresos = new JMenuItem("Ingresos");
		mntmIngresos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showVistasIngresos();
			}
		});
		mnIngresos.add(mntmIngresos);
		
		//Caja de texto
		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		//JPanel Ventanas
		Ventanas = new JPanel();
		contentPane.add(Ventanas, BorderLayout.CENTER);
		Ventanas.setLayout(new CardLayout(0, 0));
		
		//Ventana Login
		Login = new Login();
		Ventanas.add(Login, "Login");
		
		//Ventana Perfil		
		Perfil = new Perfil();
		Ventanas.add(Perfil, "Perfil");
		
		//Ventana Gastos
		Gastos = new Gastos();
		Ventanas.add(Gastos, "Gastos");
		
		//Ventana Ingresos
		Ingresos = new Ingresos();
		Ventanas.add(Ingresos, "Ingresos");
	}
	//Implementar SingleTon
		public static  Inicio getInstance() {
				      if(instance == null) {
				         instance = new Inicio();
				      }
				      return instance;
		}
	
	public void showVistasLogin(ArrayList<String> Usuarios) {
		CardLayout c=(CardLayout)this.Ventanas.getLayout();
		c.show(Ventanas, "Login");	
	}
	public void showVistasPerfil() {
		CardLayout c=(CardLayout)this.Ventanas.getLayout();
		c.show(Ventanas, "Perfil");	
	}
	public void showVistasGastos(ArrayList<ObjGastos>Gasto) {
		CardLayout c=(CardLayout)this.Ventanas.getLayout();
		c.show(Ventanas, "Gastos");	
	}
	public void showVistasIngresos() {
		CardLayout c=(CardLayout)this.Ventanas.getLayout();
		c.show(Ventanas, "Ingresos");
	}
	public void showMensaje(String Mensaje){
		this.textField.setText(Mensaje);
	}



	



	
	
}


	


