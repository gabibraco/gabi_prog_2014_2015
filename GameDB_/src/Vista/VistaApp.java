package Vista;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	VistaPrincipal vistaPrincipal = new VistaPrincipal();
	

	
		public VistaApp() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 465);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new CardLayout(0, 0));
			contentPane.add(vistaPrincipal, "Vista_Principal");
			
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnPrincipal = new JMenu("Principal");
			menuBar.add(mnPrincipal);
			
			JMenuItem mntmPrincipal = new JMenuItem("Principal");
			mnPrincipal.add(mntmPrincipal);
			
			JMenu mnJuegos = new JMenu("Juegos");
			menuBar.add(mnJuegos);
			
			JMenuItem mntmJuegos = new JMenuItem("Juegos");
			mnJuegos.add(mntmJuegos);
			
			JMenu mnPerfil = new JMenu("Perfil");
			menuBar.add(mnPerfil);
			
			JMenuItem mntmPerfil = new JMenuItem("Perfil");
			mnPerfil.add(mntmPerfil);
			
			
			JPanel Principal = new JPanel();
			contentPane.add(Principal, "Principal");
			
			
			JPanel Juegos = new JPanel();
			contentPane.add(Juegos, "Juegos");
			
			JPanel Perfil = new JPanel();
			contentPane.add(Perfil, "Perfil");
			
	}

}
