package Vistas;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gastos extends JPanel {
	
	//Definicion de Variables
	private JTextField CajaNombreFijo;
	private JTextField CajaImporteFijo;
	private JTextField CajaNombreVariable;
	private JTextField CajaImporteVariable;
	private JTextField CajaTotFijos;
	private JTextField CajaTotVariable;
	private JTextField CajaTotal;
	private JLabel LabelMes;
	private JPanel PanelJlist;
	private JLabel LabelGastosFijos;
	private JPanel PanelFijos;
	private JLabel LabelGastosVriables;
	private JPanel panel;
	private JLabel LabelTotales;
	private JPanel PanelTotales;
	private JButton BotonIngresos;
	private JLabel LabelTotalFijos;
	private JLabel LabelTotalVariable;
	private JLabel LabelTotalGastos;
	private JLabel LabelVariables;
	private JLabel LabelImporteVariable;
	private JLabel LabelFijos;
	private JLabel LabelImporte;
	private JScrollBar scrollBar;
	private JList list;

	
	public Gastos() {
		setLayout(null);
		
		//Etiqueta Mes
		LabelMes = new JLabel("Mes");
		LabelMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelMes.setBounds(10, 27, 99, 20);
		add(LabelMes);
		
		//Panel para el JList y el JScroll
		PanelJlist = new JPanel();
		PanelJlist.setBorder(new LineBorder(Color.GRAY, 1, true));
		PanelJlist.setBounds(10, 47, 113, 140);
		add(PanelJlist);
		PanelJlist.setLayout(null);
		
			//Caracteristicas Jlist
			list = new JList();
			list.setBorder(new LineBorder(Color.LIGHT_GRAY));
			list.setBounds(10, 228, 93, -216);
			PanelJlist.add(list);
		
			//Caracteristicas JScroll
			scrollBar = new JScrollBar();
			scrollBar.setBackground(Color.DARK_GRAY);
			scrollBar.setForeground(Color.GRAY);
			scrollBar.setBounds(10, 11, 17, 118);
			PanelJlist.add(scrollBar);
		
		//Etiqueta Gastos Fijos
		LabelGastosFijos = new JLabel("Gastos Fijos");
		LabelGastosFijos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelGastosFijos.setBounds(139, 27, 99, 20);
		add(LabelGastosFijos);
		
		//Panel Gastos Fijos
		PanelFijos = new JPanel();
		PanelFijos.setBorder(new LineBorder(Color.GRAY, 1, true));
		PanelFijos.setBounds(133, 47, 138, 140);
		add(PanelFijos);
		PanelFijos.setLayout(null);
		
			//Etiqueta Gastos Fijos
			LabelFijos = new JLabel("Nombre Gastos");
			LabelFijos.setFont(new Font("Tahoma", Font.PLAIN, 12));
			LabelFijos.setBounds(10, 11, 118, 21);
			PanelFijos.add(LabelFijos);
		
			//Caja Gastos Fijos
			CajaNombreFijo = new JTextField();
			CajaNombreFijo.setBounds(10, 43, 118, 20);
			PanelFijos.add(CajaNombreFijo);
			CajaNombreFijo.setColumns(10);
		
			//Etiqueta Gastos Fijos(Importe)
			LabelImporte = new JLabel("Importe Fijo");
			LabelImporte.setFont(new Font("Tahoma", Font.PLAIN, 12));
			LabelImporte.setBounds(10, 74, 118, 21);
			PanelFijos.add(LabelImporte);
		
			//Caja Gastos Fijos (Importe)
			CajaImporteFijo = new JTextField();
			CajaImporteFijo.setColumns(10);
			CajaImporteFijo.setBounds(10, 102, 118, 20);
			PanelFijos.add(CajaImporteFijo);
			
		//Etiqueta Gastos Variables
		LabelGastosVriables = new JLabel("Gastos Variables");
		LabelGastosVriables.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelGastosVriables.setBounds(291, 27, 99, 20);
		add(LabelGastosVriables);
			
		//Panel Gastos Variables
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBounds(291, 47, 138, 140);
		add(panel);
		
			//Etiqueta Gastos Variables
			LabelVariables = new JLabel("Nombre Gastos");
			LabelVariables.setFont(new Font("Tahoma", Font.PLAIN, 12));
			LabelVariables.setBounds(10, 11, 118, 21);
			panel.add(LabelVariables);
		
			//Caja Gastos Variables(Nombre)
			CajaNombreVariable = new JTextField();
			CajaNombreVariable.setColumns(10);
			CajaNombreVariable.setBounds(10, 43, 118, 20);
			panel.add(CajaNombreVariable);
		
			//Etiqueta Gastos Variables(Importe)
			LabelImporteVariable = new JLabel("Importe Variable");
			LabelImporteVariable.setFont(new Font("Tahoma", Font.PLAIN, 12));
			LabelImporteVariable.setBounds(10, 74, 118, 21);
			panel.add(LabelImporteVariable);
		
			//Caja Gastos Variables(Importe)
			CajaImporteVariable = new JTextField();
			CajaImporteVariable.setColumns(10);
			CajaImporteVariable.setBounds(10, 102, 118, 20);
			panel.add(CajaImporteVariable);
		
		//Etiqueta Gastos Totales
		LabelTotales = new JLabel("Gastos Totales");
		LabelTotales.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelTotales.setBounds(133, 198, 296, 14);
		add(LabelTotales);
		
			//Panel Gastos Totales
			PanelTotales = new JPanel();
			PanelTotales.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelTotales.setBounds(133, 212, 296, 63);
			add(PanelTotales);
			PanelTotales.setLayout(null);
		
			//Etiqueta de Totales Fijos
			LabelTotalFijos = new JLabel("Total Fijos");
			LabelTotalFijos.setBounds(10, 11, 65, 14);
			PanelTotales.add(LabelTotalFijos);
		
			//Caja de Totales Fijos (Importe)
			CajaTotFijos = new JTextField();
			CajaTotFijos.setBounds(10, 36, 86, 20);
			PanelTotales.add(CajaTotFijos);
			CajaTotFijos.setColumns(10);
		
			//Etiqueta de Totales Variables 
			LabelTotalVariable = new JLabel("Total Variable");
			LabelTotalVariable.setBounds(105, 11, 65, 14);
			PanelTotales.add(LabelTotalVariable);
		
			//Caja de Totales Variables (Importe)
			CajaTotVariable = new JTextField();
			CajaTotVariable.setColumns(10);
			CajaTotVariable.setBounds(105, 36, 86, 20);
			PanelTotales.add(CajaTotVariable);
		
			//Etiqueta de Total Gastos
			LabelTotalGastos = new JLabel("Total ");
			LabelTotalGastos.setBounds(206, 11, 65, 14);
			PanelTotales.add(LabelTotalGastos);
		
			//Caja de Totales Gastos(Importe)
			CajaTotal = new JTextField();
			CajaTotal.setColumns(10);
			CajaTotal.setBounds(201, 36, 86, 20);
			PanelTotales.add(CajaTotal);
			
		//Botonn Ingresos
		BotonIngresos = new JButton("Ingresos");
		BotonIngresos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showVistasIngresos();
			}
		});
		BotonIngresos.setBounds(10, 212, 113, 23);
		add(BotonIngresos);
		
	}
}
