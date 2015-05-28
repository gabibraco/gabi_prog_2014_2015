package Vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import Controlador.MainControler;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaApp extends JFrame {
	
	//DEFINICION DE VARIABLES
	private JPanel contentPane;
	private JPanel Perfil;
	private JMenu mnPrincipal;
	private JMenu mnJuegos;
	private JMenu mnPerfil;
	private VistaPrincipal vPrincipal;
	private VistaJuegos vJuegos;
	private JPanel panel;
	
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		//INTRODUCIMOS EL MENU
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//MENU PRINCIPAL
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainControler.getInstance().showInicio();	
			}
		});
		mnPrincipal.add(mntmPrincipal);
		
		//MENU JUEGOS
		mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mntmJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainControler.getInstance().showJuegos();
			}
		});
		mnJuegos.add(mntmJuegos);
		
		//MENU PERFIL
		mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnPerfil.add(mntmPerfil);
		
			//Panel de ventanas 
			panel = new JPanel();
			contentPane.add(panel, "panel");
			panel.setLayout(new CardLayout(0, 0));
			
			//Añadimos Vista principal
			vPrincipal= new VistaPrincipal();
			panel.add(vPrincipal, "Principal");
			
			//Añadimos Vista juegos
			vJuegos= new VistaJuegos();
			panel.add(vJuegos, "Juegos");
			
			//Perfil
			Perfil = new JPanel();
			panel.add(Perfil, "Perfil");
			
			
				
	}
	//Cargamos los usuarios y mostramos la ventana principal
	public void showVistaPrincipal(ArrayList<String> Usuarios) {
		CardLayout c=(CardLayout)this.panel.getLayout();
		c.show(panel, "Principal");	
	}
	//Cargamos la vista de juegos
	public void showvJuegos() {
		CardLayout c=(CardLayout)this.panel.getLayout();
		c.show(panel, "Juegos");	
	}


}
