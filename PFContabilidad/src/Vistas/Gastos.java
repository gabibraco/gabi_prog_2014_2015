/*Nuestra Ventana de tipo CardLayout Gastos */



package Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.MainControler;

import Modelos.ObjGastos;
import Modelos.ModeloGastos;
import Modelos.UsuariosModel;

import javax.swing.AbstractListModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Gastos extends JPanel {
	
	//Definicion de Variables
	public JTextField CajaNombreFijo;
	public JTextField CajaImporteFijo;
	public JTextField CajaNombreVariable;
	public JTextField CajaImporteVariable;
	public JTextField CajaTotFijos;
	public JTextField CajaTotVariable;
	public JTextField CajaTotal;
	private JLabel LabelMes;
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
	private DefaultListModel ListModel;
	private JList list;
	private JTextField CajaMes;
	private JButton BotonSalvar;
	private JButton BotonEditar;
	
	
	
	public Gastos() {
		setBorder(null);
		setLayout(null);
		
		//Etiqueta Mes
		LabelMes = new JLabel(); 
		LabelMes.setText("Mes");
		LabelMes.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
		LabelMes.setBounds(10, 27, 99, 20);
		add(LabelMes);
		
		//Etiqueta Gastos Fijos
		LabelGastosFijos = new JLabel(); 
		LabelGastosFijos.setText("Gastos Fijos");
		LabelGastosFijos.setFont(new Font("Tahoma", Font.PLAIN, 12)); //$NON-NLS-1$
		LabelGastosFijos.setBounds(139, 27, 99, 20);
		add(LabelGastosFijos);
		
		//Panel Gastos Fijos
		PanelFijos = new JPanel();
		PanelFijos.setBorder(new LineBorder(Color.GRAY, 1, true));
		PanelFijos.setBounds(133, 47, 138, 140);
		add(PanelFijos);
		PanelFijos.setLayout(null);
		
			//Etiqueta Gastos Fijos
			LabelFijos = new JLabel(); 
			LabelFijos.setText("Gastos Fijos");
			LabelFijos.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
			LabelFijos.setBounds(10, 11, 118, 21);
			PanelFijos.add(LabelFijos);
		
			//Caja Gastos Fijos
			CajaNombreFijo = new JTextField();
			CajaNombreFijo.setBounds(10, 43, 118, 20);
			PanelFijos.add(CajaNombreFijo);
			CajaNombreFijo.setColumns(10);
		
			//Etiqueta Gastos Fijos(Importe)
			LabelImporte = new JLabel(); 
			LabelImporte.setText("Importe Fijos");
			LabelImporte.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
			LabelImporte.setBounds(10, 74, 118, 21);
			PanelFijos.add(LabelImporte);
		
			//Caja Gastos Fijos (Importe)
			CajaImporteFijo = new JTextField();
			CajaImporteFijo.setColumns(10);
			CajaImporteFijo.setBounds(10, 102, 118, 20);
			PanelFijos.add(CajaImporteFijo);
			
		//Etiqueta Gastos Variables
		LabelGastosVriables = new JLabel(); 
		LabelGastosVriables.setText("Gastos Variables");
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
			LabelVariables = new JLabel(); 
			LabelVariables.setText("Gastos Variables");
			LabelVariables.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
			LabelVariables.setBounds(10, 11, 118, 21);
			panel.add(LabelVariables);
		
			//Caja Gastos Variables(Nombre)
			CajaNombreVariable = new JTextField();
			CajaNombreVariable.setColumns(10);
			CajaNombreVariable.setBounds(10, 43, 118, 20);
			panel.add(CajaNombreVariable);
		
			//Etiqueta Gastos Variables(Importe)
			LabelImporteVariable = new JLabel(); 
			LabelImporteVariable.setText("Importe Vriables");
			LabelImporteVariable.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
			LabelImporteVariable.setBounds(10, 74, 118, 21);
			panel.add(LabelImporteVariable);
		
			//Caja Gastos Variables(Importe)
			CajaImporteVariable = new JTextField();
			CajaImporteVariable.setColumns(10);
			CajaImporteVariable.setBounds(10, 102, 118, 20);
			panel.add(CajaImporteVariable);
		
		//Etiqueta Gastos Totales
		LabelTotales = new JLabel(); 
		LabelTotales.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
		LabelTotales.setBounds(133, 198, 296, 14);
		add(LabelTotales);
		
			//Panel Gastos Totales
			PanelTotales = new JPanel();
			PanelTotales.setBorder(new LineBorder(Color.GRAY, 1, true));
			PanelTotales.setBounds(133, 212, 296, 73);
			add(PanelTotales);
			PanelTotales.setLayout(null);
		
			//Etiqueta de Totales Fijos
			LabelTotalFijos = new JLabel(); 
			LabelTotalFijos.setText("Total Fijos");
			LabelTotalFijos.setBounds(10, 11, 86, 14);
			PanelTotales.add(LabelTotalFijos);
		
			//Caja de Totales Fijos (Importe)
			CajaTotFijos = new JTextField();
			CajaTotFijos.setBounds(10, 36, 86, 20);
			PanelTotales.add(CajaTotFijos);
			CajaTotFijos.setColumns(10);
		
			//Etiqueta de Totales Variables 
			LabelTotalVariable = new JLabel(); 
			LabelTotalVariable.setText("Total Variables");
			LabelTotalVariable.setBounds(105, 11, 86, 14);
			PanelTotales.add(LabelTotalVariable);
		
			//Caja de Totales Variables (Importe)
			CajaTotVariable = new JTextField();
			CajaTotVariable.setColumns(10);
			CajaTotVariable.setBounds(105, 36, 86, 20);
			PanelTotales.add(CajaTotVariable);
		
			//Etiqueta de Total Gastos
			LabelTotalGastos = new JLabel(); 
			LabelTotalGastos.setText("Total Gastos");
			LabelTotalGastos.setBounds(206, 11, 65, 14);
			PanelTotales.add(LabelTotalGastos);
		
			//Caja de Totales Gastos(Importe)
			CajaTotal = new JTextField();
			CajaTotal.setColumns(10);
			CajaTotal.setBounds(201, 36, 86, 20);
			PanelTotales.add(CajaTotal);
			
		//Botonn Ingresos
		BotonIngresos = new JButton(); 
		BotonIngresos.setText("Ingresos>");
		BotonIngresos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainControler.getInstance().showvIngresos();
				
			}
		});
		BotonIngresos.setBounds(10, 198, 113, 23);
		add(BotonIngresos);
		/*Boton Salvar que contiene un Listener donde se recojen las modificaciones realizadas en los diferentes
		 * Textfields y los datos que tenemos en la lista 
		 */
		BotonSalvar = new JButton("Salvar");
		BotonSalvar.setBounds(10, 228, 113, 23);
		add(BotonSalvar);
		BotonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObjGastos NGasto=(ObjGastos)ListModel.getElementAt(list.getSelectedIndex());
				ObjGastos update = new ObjGastos (
												  NGasto.getid(),
												  NGasto.getMes(),
												  CajaNombreFijo.getText(),
												  CajaImporteFijo.getText(),
												  CajaTotFijos.getText(),
												  CajaNombreVariable.getText(),
												  CajaImporteVariable.getText(),
												  CajaTotVariable.getText(),
												  CajaTotal.getText());
				
				MainControler.getInstance().updateGasto(update);
			}
		});
		
		/*Boton Editar con un Listener que nos permitira escribir en los diferentes Textfields*/
		BotonEditar = new JButton("Editar");
		BotonEditar.setBounds(10, 262, 113, 23);
		add(BotonEditar);
		BotonEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   CajaNombreFijo.setEnabled(true);
		           CajaImporteFijo.setEnabled(true);
		           CajaNombreVariable.setEnabled(true);
		           CajaImporteVariable.setEnabled(true);
		           CajaTotFijos.setEnabled(true);
		           CajaTotVariable.setEnabled(true);
		           CajaTotal.setEnabled(true);
			}
		});
		
		//Panel JList
		JPanel panelJList = new JPanel();
		panelJList.setBounds(10, 47, 113, 140);
		panelJList.setLayout(null);
		add(panelJList);
		//Scroll Panel
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, 113, 140);
		panelJList.add(scrollPane);
		
		//permite mayor control sobre el JList
		ListModel = new DefaultListModel();
		list = new JList(ListModel) ;
		
		//Nuestra Lista(Recopilamos los datos del Array de objetos que tenemos.
		list.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		list.setBackground(Color.LIGHT_GRAY);
		list.setValueIsAdjusting(true);
		list.setVisibleRowCount(6);
		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				if((ListModel!=null)&&(list!=null)){
						if(list.getSelectedIndex()>0){		
				//COJO EL ELEMENTO SELECCIONADO
				ObjGastos NGasto=(ObjGastos)ListModel.getElementAt
				(list.getSelectedIndex());
				CajaNombreFijo.setText(NGasto.getNomGF());
				CajaImporteFijo.setText(NGasto.getImportGF());
				CajaTotFijos.setText(NGasto.getTotalGF());
				CajaNombreVariable.setText(NGasto.getNomGV());
				CajaImporteVariable.setText(NGasto.getImportGV());
				CajaTotVariable.setText(NGasto.getTotalGV());
				CajaTotal.setText(NGasto.getTotalGastos());	
				}}
			}
		});		         
}
		
	 /*Al haber definido el modelo, los datos sobre el JList se realizar� sobre el Modelo,
    no sobre el JList, recojemos los datos del array a traves de iterator y los pasamos al listmodel*/
    public void cargarGastos(ArrayList<ObjGastos>  gastos){
    	Iterator<ObjGastos> it2= gastos.iterator();
        ListModel.removeAllElements();
        
            while(it2.hasNext()){
            	ObjGastos NGasto=(ObjGastos)it2.next();
                //A�adimos el objeto Game en el modelo
                ListModel.addElement(NGasto);
	            };
	//Otra Accion que realiamos es deshabilitar los textFields
	           CajaNombreFijo.setEnabled(false);
	           CajaImporteFijo.setEnabled(false);
	           CajaTotFijos.setEnabled(false);
	           CajaNombreVariable.setEnabled(false);
	           CajaImporteVariable.setEnabled(false);
	           CajaTotVariable.setEnabled(false);
	           CajaTotal.setEnabled(false);
       	}
	}
	  

