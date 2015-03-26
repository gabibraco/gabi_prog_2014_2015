package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;

public class VistaApp extends JFrame {
	//DEFINICION DE VARIABLES
	private JPanel contentPane;
	private JPanel Principal;
	private JPanel Juegos;
	private JPanel Perfil;
	private JMenu mnPrincipal;
	private JMenu mnJuegos;
	private JMenu mnPerfil;
	
	VistaPrincipal vistaPrincipal = new VistaPrincipal();
	
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(vistaPrincipal, "Vista_Principal");//Añadimos Vista principal
		//INTRODUCIMOS EL MENU
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//MENU PRINCIPAL
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mnPrincipal.add(mntmPrincipal);
		
		//MENU JUEGOS
		mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mnJuegos.add(mntmJuegos);
		
		//MENU PERFIL
		mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnPerfil.add(mntmPerfil);
		
		// AÑADIMOS 3 JPANEL DENTRO DEL CARDLAYUOT
		
			//PRINCIPAL
			Principal = new JPanel();
			contentPane.add(Principal, "Principal");
		
			//JUEGOS
			Juegos = new JPanel();
			contentPane.add(Juegos, "Juegos");
			
			//Perfil
			Perfil = new JPanel();
			contentPane.add(Perfil, "Perfil");
		
		
		
	}

}
