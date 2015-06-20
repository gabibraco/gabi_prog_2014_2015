package Vistas;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.MainControler;
import Modelos.ObjGastos;
import Modelos.ObjIngresos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class Ingresos extends JPanel {
	//Definicion de Variables
	public JTextField CajaTipoIngreso;
	public JTextField CajaIngresoImporte;
	public JTextField CajaTipoVariable;
	public JTextField CajaImporteVariable;
	public JTextField CajaTotIngFijos;
	public JTextField CajaTotIngVariables;
	public JTextField CajaTotIngresos;
	private JLabel LabelMesIng;
	private JList list;
	
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
	private DefaultListModel ListModel;
	
		public Ingresos() {
			setLayout(null);
			//Etiqueta de Mes
			LabelMesIng = new JLabel("Mes");
			LabelMesIng.setBounds(10, 22, 124, 14);
			add(LabelMesIng);
			
			
			
				
				
				
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
			LabelIngresosTotales.setBounds(155, 201, 272, 14);
			add(LabelIngresosTotales);
			
			//Panel de Ingresos Totales
			JPanel PanelIngresosTotales = new JPanel();
			PanelIngresosTotales.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelIngresosTotales.setBounds(157, 216, 272, 73);
			add(PanelIngresosTotales);
			PanelIngresosTotales.setLayout(null);
			
				//Etiqueta de Total Ingresos Fijos
				LabelTotIngFijos = new JLabel("Total Fijos");
				LabelTotIngFijos.setBounds(10, 11, 86, 14);
				PanelIngresosTotales.add(LabelTotIngFijos);
			
				//Caja de total Ingrasos Fijos 
				CajaTotIngFijos = new JTextField();
				CajaTotIngFijos.setBounds(10, 36, 68, 20);
				PanelIngresosTotales.add(CajaTotIngFijos);
				CajaTotIngFijos.setColumns(10);
			
				//Etiqueta de Ingresos Totales Variables
				LabelTotIngVariables = new JLabel("Total Variables");
				LabelTotIngVariables.setBounds(89, 11, 86, 14);
				PanelIngresosTotales.add(LabelTotIngVariables);
			
				//Caja Ingresos Totales Variables 
				CajaTotIngVariables = new JTextField();
				CajaTotIngVariables.setColumns(10);
				CajaTotIngVariables.setBounds(88, 36, 73, 20);
				PanelIngresosTotales.add(CajaTotIngVariables);
			
				//Etiquetas Total Variables 
				LabelTotalVariables = new JLabel("Total Ingresos");
				LabelTotalVariables.setBounds(185, 11, 79, 14);
				PanelIngresosTotales.add(LabelTotalVariables);
			
				//Caja de total Ingresos 
				CajaTotIngresos = new JTextField();
				CajaTotIngresos.setColumns(10);
				CajaTotIngresos.setBounds(185, 36, 73, 20);
				PanelIngresosTotales.add(CajaTotIngresos);
				
				JPanel panelJList = new JPanel();
				panelJList.setBounds(10, 47, 113, 140);
				panelJList.setLayout(null);
				add(panelJList);

				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(0, 0, 113, 140);
				panelJList.add(scrollPane);
				
				
				
				//permite mayor control sobre el JList
				ListModel = new DefaultListModel();
				JList list = new JList(ListModel) ;
				list.setValueIsAdjusting(true);
				list.setVisibleRowCount(6);
				
				scrollPane.setViewportView(list);
				list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				list.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent listSelectionEvent) {
						if((ListModel!=null)&&(list.getSelectedIndex()>-1)){
						//COJO EL ELEMENTO SELECCIONADO
						ObjIngresos NIngreso=(ObjIngresos)ListModel.getElementAt(list.getSelectedIndex());
						CajaTipoIngreso.setText(NIngreso.getNomIF());
						CajaIngresoImporte.setText(NIngreso.getImportIF());
						CajaTotIngFijos.setText(NIngreso.getTotalIF());
						CajaTipoVariable.setText(NIngreso.getNomIV());
						CajaImporteVariable.setText(NIngreso.getImportIV());
						CajaTotIngVariables.setText(NIngreso.getTotalIV());
						CajaTotIngresos.setText(NIngreso.getTotalIngresos());	
						}
					}
				});	
				
			//Boton Gastos	
			BotonGastos = new JButton("<Gastos");
			BotonGastos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainControler.getInstance().showvGasto();
				}
			});
			BotonGastos.setBounds(10, 216, 107, 23);
			add(BotonGastos);

	}
		public void cargarIngresos(ArrayList<ObjIngresos>  ingresos){
		      
	    	Iterator<ObjIngresos> it3= ingresos.iterator();
	        ListModel.removeAllElements();
	        
	            while(it3.hasNext()){
	            	ObjIngresos NIngreso=(ObjIngresos)it3.next();
	                //Añadimos el objeto Game en el modelo
	                ListModel.addElement(NIngreso);
		            };
	       	}	

}
