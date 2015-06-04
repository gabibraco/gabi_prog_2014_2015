package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JPanel {
	private JTextField CajaNombre;
	private JTextField CajaApellidos;
	private JTextField CajaDireccion;
	private JTextField CajaEmail;
	private JTextField CajaDNI;
	private JTextField CajaEdad;

	
	public Perfil() {
		setLayout(null);
		//Avatar(foto perfil)
		JLabel Avatar = new JLabel("Avatar");
		Avatar.setToolTipText("");
		Avatar.setLabelFor(this);
		Avatar.setHorizontalAlignment(SwingConstants.LEFT);
		Avatar.setBackground(Color.LIGHT_GRAY);
		Avatar.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/perfil2.png")));
		Avatar.setBounds(10, 11, 145, 124);
		add(Avatar);
		
		//Etiqueta Nombre
		JLabel LabelNombre = new JLabel("Nombre");
		LabelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelNombre.setBounds(10, 146, 191, 14);
		add(LabelNombre);
		
		//Caja Nombre
		CajaNombre = new JTextField();
		CajaNombre.setBounds(10, 168, 191, 20);
		add(CajaNombre);
		CajaNombre.setColumns(10);
		
		//Etuiqueta Apellidos
		JLabel LabelApellidos = new JLabel("Apellidos");
		LabelApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelApellidos.setBounds(10, 200, 191, 14);
		add(LabelApellidos);
		
		//Caja Apellidos
		CajaApellidos = new JTextField();
		CajaApellidos.setColumns(10);
		CajaApellidos.setBounds(10, 223, 191, 20);
		add(CajaApellidos);
		
		//Etiqueta Direccion
		JLabel LabelDireccion = new JLabel("Direccion");
		LabelDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelDireccion.setBounds(10, 252, 191, 14);
		add(LabelDireccion);
		
		//Caja Direccion
		CajaDireccion = new JTextField();
		CajaDireccion.setColumns(10);
		CajaDireccion.setBounds(10, 269, 191, 20);
		add(CajaDireccion);
		
		//Etiqueta Email
		JLabel LabelEmail = new JLabel("Email");
		LabelEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelEmail.setBounds(249, 147, 191, 14);
		add(LabelEmail);
		
		//Caja Email
		CajaEmail = new JTextField();
		CajaEmail.setColumns(10);
		CajaEmail.setBounds(249, 168, 191, 20);
		add(CajaEmail);
		
		//Etiqueta DNI
		JLabel LabelDNI = new JLabel("DNI/NIF");
		LabelDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelDNI.setBounds(249, 200, 191, 14);
		add(LabelDNI);
		
		//Caja DNI
		CajaDNI = new JTextField();
		CajaDNI.setColumns(10);
		CajaDNI.setBounds(249, 223, 191, 20);
		add(CajaDNI);
		
		//Etiqueta Edad
		JLabel LabelEdad = new JLabel("Edad");
		LabelEdad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelEdad.setBounds(249, 253, 191, 14);
		add(LabelEdad);
		
		//Caja Edad
		CajaEdad = new JTextField();
		CajaEdad.setColumns(10);
		CajaEdad.setBounds(249, 269, 191, 20);
		add(CajaEdad);
		
		//Boton Gastos
		JButton BotonGastos = new JButton("Gastos");
		BotonGastos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showVistasGastos();
			}
		});
		BotonGastos.setBounds(249, 23, 191, 23);
		add(BotonGastos);
		
		//Boton Ingresos
		JButton BotonIngresos = new JButton("Ingresos");
		BotonIngresos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showVistasIngresos();
			}
		});
		BotonIngresos.setBounds(249, 62, 191, 23);
		add(BotonIngresos);
		
	}

}
