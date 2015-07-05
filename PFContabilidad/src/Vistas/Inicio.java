/*Este sera nuestro content panel que contendra las diferentes ventanas de nuestro
 * proyecto.*/


package Vistas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.AbstractCollection;
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
import Controller.MainControler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Inicio extends JFrame {
	
	
	//Definicion de variables
	public static JPanel contentPane;
	private JTextField textField;
	public static JPanel Ventanas;
	private JMenuItem mntmIngresos;
	private JMenu mnIngresos;
	private JMenu mnGatos;
	private JMenu mnPerfil;
	private JMenu mnNewMenu;
	private JMenuBar menuBar;
	//Instancia unica		
	private static Inicio instance = null;
	private Gastos vGasto;
	private Login vLogin;
	private Perfil vPerfil;
	private Ingresos vIngresos;
	
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
				MainControler.getInstance().showvLogin();
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
				MainControler.getInstance().showvPerfil();	
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
				MainControler.getInstance().showvGasto();
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
				MainControler.getInstance().showvIngresos();
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
		vLogin = new Login();
		Ventanas.add(vLogin, "Login");
		
		//Ventana Perfil		
		vPerfil = new Perfil();
		Ventanas.add(vPerfil, "Perfil");
		
		//Ventana Gastos
		vGasto = new Gastos();
		Ventanas.add(vGasto, "Gastos");
		
		//Ventana Ingresos
		vIngresos = new Ingresos();
		Ventanas.add(vIngresos, "Ingresos");
	}
	
	//Implementar SingleTon
		public static  Inicio getInstance() {
			if(instance == null) {
			   instance = new Inicio();
			}
			return instance;
			}
		
		//cargamos el panel principal
		public void showvLogin(Iterator Objetoiterador) {
			//llamada a metodo para cargar los usuarios
			vLogin.cargaUsuarios(Objetoiterador);	
			vLogin.setVisible(true);
			vGasto.setVisible(false);
			vIngresos.setVisible(false);
			vPerfil.setVisible(false);
		}
		
		//Cargamos Panel Gasto
		public void showvGasto(ArrayList Gasto) {
			//LLamada a metodo para cargar gastos
			vGasto.cargarGastos(Gasto);	
			vGasto.setVisible(true);
			vLogin.setVisible(false);
			vIngresos.setVisible(false);
			vPerfil.setVisible(false);
		}
		
		//Cargamos panel Ingresos
		public void showvIngresos(ArrayList Ingreso) {
			//LLamada a metodo para cargar Ingresos
			vIngresos.cargarIngresos(Ingreso);	
			vIngresos.setVisible(true);
			vLogin.setVisible(false);
			vGasto.setVisible(false);
			vPerfil.setVisible(false);
		}
		
		//Cargamos panel Perfil
		public void showvPerfil(ArrayList Perfil) {
			//Llamada a metedo cargar perfil
			vPerfil.cargarPerfiles(Perfil);	
			vPerfil.setVisible(true);
			vIngresos.setVisible(false);
			vLogin.setVisible(false);
			vGasto.setVisible(false);
		}
		
		//Cargar Mensaje Inicio
		public void showMensaje(String Mensaje){
			this.textField.setText(Mensaje);
		}
	



	



	
	
}


	


