package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VistaPrincipal extends JPanel {

		private JPanel Principal;
		private JTextField textField;
		private JTextField CajaContraseña;
	
	public VistaPrincipal() {
			
			setLayout(null);
			
			
			
			
			JLabel lblAvatar = new JLabel("Avatar");
			lblAvatar.setIcon(new ImageIcon("C:\\Users\\Gabi\\Desktop\\icono.png"));
			lblAvatar.setBounds(22, 11, 141, 140);
			add(lblAvatar);
			
			JLabel lblUsuario = new JLabel("Usuario");
			lblUsuario.setBounds(22, 173, 150, 19);
			add(lblUsuario);
			
			JLabel lblContrasea = new JLabel("Contrase\u00F1a");
			lblContrasea.setBounds(22, 234, 150, 14);
			add(lblContrasea);
			
			CajaContraseña = new JTextField();
			CajaContraseña.setBounds(22, 259, 150, 20);
			add(CajaContraseña);
			CajaContraseña.setColumns(10);
			
			JButton btnJuegos = new JButton("Juegos>");
			btnJuegos.setBounds(208, 36, 160, 23);
			add(btnJuegos);
			
			JButton btnPerfil = new JButton("Perfil>");
			btnPerfil.setBounds(208, 70, 160, 23);
			add(btnPerfil);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(22, 203, 150, 20);
			add(comboBox);
			
			JButton btnLogIn = new JButton("LogIn");
			btnLogIn.setForeground(Color.GRAY);
			btnLogIn.setEnabled(false);
			btnLogIn.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			btnLogIn.setBounds(22, 314, 150, 23);
			add(btnLogIn);
			
			JButton btnRegistrarse = new JButton("Registrarse");
			btnRegistrarse.setEnabled(false);
			btnRegistrarse.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			btnRegistrarse.setBounds(22, 355, 150, 23);
			add(btnRegistrarse);
	}

}
