package Vistas;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingresos extends JPanel {
	//Definicion de Variables
	private JTextField CajaTipoIngreso;
	private JTextField CajaIngresoImporte;
	private JTextField CajaTipoVariable;
	private JTextField CajaImporteVariable;
	private JTextField CajaTotIngFijos;
	private JTextField CajaTotIngVariables;
	private JTextField CajaTotIngresos;
	private JLabel LabelMesIng;
	private JList list;
	private JScrollBar scrollBar;
	private JLabel LabelIngresosFijos;
	private JLabel LabelTipoIngreso;
	private JLabel LabelImporteFijo;
	private JLabel LabelIngresosVariables;
	private JLabel LabelConcepto;
	private JLabel LabelImporteVariable;
	private JLabel LabelIngresosTotales;
	private JLabel LabelTotIngFijos;
	private JLabel LabelTotIngVariables;
	private JLabel LabelTotalVariables;
	private JButton BotonGastos;

		public Ingresos() {
			setLayout(null);
			//Etiqueta de Mes
			LabelMesIng = new JLabel("Mes");
			LabelMesIng.setBounds(10, 22, 124, 14);
			add(LabelMesIng);
			
			//Panel Mes( JList y JScroll)
			JPanel PanelMes = new JPanel();
			PanelMes.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelMes.setBounds(10, 40, 124, 150);
			add(PanelMes);
			PanelMes.setLayout(null);
			
				//Caracteristicas JList
				list = new JList();
				list.setBounds(10, 147, 104, -135);
				PanelMes.add(list);
			
				//Caracteristicas de JScroll
				scrollBar = new JScrollBar();
				scrollBar.setBounds(10, 11, 17, 134);
				PanelMes.add(scrollBar);
				
			//Etiqueta de Ingresos Fijos 
			LabelIngresosFijos = new JLabel("Ingresos Fijos");
			LabelIngresosFijos.setBounds(157, 22, 124, 14);
			add(LabelIngresosFijos);	
				
			//Panel Ingresos Fijos	
			JPanel PanelIngFijos = new JPanel();
			PanelIngFijos.setLayout(null);
			PanelIngFijos.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelIngFijos.setBounds(157, 40, 124, 150);
			add(PanelIngFijos);
			
				//Etiqueta Tipo Ingreso
				LabelTipoIngreso = new JLabel("Tipo Ingreso");
				LabelTipoIngreso.setBounds(10, 11, 104, 20);
				PanelIngFijos.add(LabelTipoIngreso);
			
				//Caja Tipo de Ingreso
				CajaTipoIngreso = new JTextField();
				CajaTipoIngreso.setBounds(10, 42, 104, 20);
				PanelIngFijos.add(CajaTipoIngreso);
				CajaTipoIngreso.setColumns(10);
			
				//Etiqueta de Importe Fijo
				LabelImporteFijo = new JLabel("Importe");
				LabelImporteFijo.setBounds(10, 75, 104, 20);
				PanelIngFijos.add(LabelImporteFijo);
			
				//Caja de Importe Fijo
				CajaIngresoImporte = new JTextField();
				CajaIngresoImporte.setColumns(10);
				CajaIngresoImporte.setBounds(10, 106, 104, 20);
				PanelIngFijos.add(CajaIngresoImporte);
				
			//Etiqueta Ingresos Variables
			LabelIngresosVariables = new JLabel("Ingresos Variables");
			LabelIngresosVariables.setBounds(303, 22, 124, 14);
			add(LabelIngresosVariables);
			
			//Panel Ingresos Variables
			JPanel PanelIngresosVariables = new JPanel();
			PanelIngresosVariables.setLayout(null);
			PanelIngresosVariables.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelIngresosVariables.setBounds(303, 40, 124, 150);
			add(PanelIngresosVariables);
			
				//Etiqueta Concepto
				LabelConcepto = new JLabel("Tipo Ingreso");
				LabelConcepto.setBounds(10, 11, 104, 20);
				PanelIngresosVariables.add(LabelConcepto);
			
				//Caja Concepto Variable
				CajaTipoVariable = new JTextField();
				CajaTipoVariable.setColumns(10);
				CajaTipoVariable.setBounds(10, 42, 104, 20);
				PanelIngresosVariables.add(CajaTipoVariable);
			
				//Etiqueta Importe Variable
				LabelImporteVariable = new JLabel("Importe");
				LabelImporteVariable.setBounds(10, 73, 104, 20);
				PanelIngresosVariables.add(LabelImporteVariable);
			
				//Caja Importe Variable
				CajaImporteVariable = new JTextField();
				CajaImporteVariable.setColumns(10);
				CajaImporteVariable.setBounds(10, 104, 104, 20);
				PanelIngresosVariables.add(CajaImporteVariable);
			
			//Etiquetas Ingresos Totales 
			LabelIngresosTotales = new JLabel("Ingresos Totales");
			LabelIngresosTotales.setBounds(133, 201, 294, 14);
			add(LabelIngresosTotales);
			
			//Panel de Ingresos Totales
			JPanel PanelIngresosTotales = new JPanel();
			PanelIngresosTotales.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelIngresosTotales.setBounds(127, 216, 300, 73);
			add(PanelIngresosTotales);
			PanelIngresosTotales.setLayout(null);
			
				//Etiqueta de Total Ingresos Fijos
				LabelTotIngFijos = new JLabel("Total Fijos");
				LabelTotIngFijos.setBounds(10, 11, 86, 14);
				PanelIngresosTotales.add(LabelTotIngFijos);
			
				//Caja de total Ingrasos Fijos 
				CajaTotIngFijos = new JTextField();
				CajaTotIngFijos.setBounds(10, 36, 86, 20);
				PanelIngresosTotales.add(CajaTotIngFijos);
				CajaTotIngFijos.setColumns(10);
			
				//Etiqueta de Ingresos Totales Variables
				LabelTotIngVariables = new JLabel("Total Variables");
				LabelTotIngVariables.setBounds(106, 11, 86, 14);
				PanelIngresosTotales.add(LabelTotIngVariables);
			
				//Caja Ingresos Totales Variables 
				CajaTotIngVariables = new JTextField();
				CajaTotIngVariables.setColumns(10);
				CajaTotIngVariables.setBounds(106, 36, 86, 20);
				PanelIngresosTotales.add(CajaTotIngVariables);
			
				//Etiquetas Total Variables 
				LabelTotalVariables = new JLabel("Total Ingresos");
				LabelTotalVariables.setBounds(202, 11, 86, 14);
				PanelIngresosTotales.add(LabelTotalVariables);
			
				//Caja de total Ingresos 
				CajaTotIngresos = new JTextField();
				CajaTotIngresos.setColumns(10);
				CajaTotIngresos.setBounds(202, 36, 86, 20);
				PanelIngresosTotales.add(CajaTotIngresos);
			
			//Boton Gastos	
			BotonGastos = new JButton("<Gastos");
			BotonGastos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainController.getInstance().showVistasGastos();
				}
			});
			BotonGastos.setBounds(10, 216, 107, 23);
			add(BotonGastos);

	}

}
