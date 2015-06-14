package Controller;


import java.util.ArrayList;

import Modelos.ConexionDB;
import Modelos.ModeloGastos;
import Modelos.ObjGastos;
import Modelos.UsuariosModel;
import Vistas.Inicio;
import Vistas.Login;
import Vistas.Gastos;

public class MainController {
	//Instancia Unica
		private static MainController instance = null;
	//Atributos de la base de datos
		ConexionDB gamedb;
	//Auntenticador
		public Autenticar auth = new Autenticar();
	//Vistas
		Inicio vInicio;
	//Usuariosmodelos
		private ArrayList<String> Usuarios;
		UsuariosModel usuarios;
	//Modelos Gastos
		private ArrayList<ObjGastos> Gasto;
		ModeloGastos gasto;
private MainController() {
	/*ESTABLECIENDO LA CONEXION A LA BBDD y GENERANDO EL OBJETO (carga la base de datos , el usuario llama al programa
	,el Main coontrller llama a la BBDD, y este verifica que si existe un usuario muestre la parte visual)*/
		gamedb =ConexionDB.getInstance("localhost","gamedb","root02","PROGBD2015");
		//INTENTA CONECTARTE
		if(gamedb.connectDB()==true){
			// SI SE CONSIGUE MUESTRA POR PANTALLA ESTO
			System.out.println("CONECTADOS CON EXITO");
		}
		//SI NO SE CONSIGUE MUESTRA POR PANTALLA ESTO 
		else{ 
			System.out.println("ERROR EN LA CONEXION");
		}
		this.showMain();
		}
		//Implementar Singleton
		public static MainController getInstance(){
			if (instance == null){
				instance=new MainController();
			}
			return instance;	
		}
		//Lanzar la vista inicial
		public void showMain(){
			
			//Cargamos los modelos necesarios para esta vista a traves del modeloUsuario
				if(usuarios==null)usuarios=new UsuariosModel();//llama a usuarios
				ArrayList<String> Usuarios= usuarios.getUsuarios();//convertimos usuarios en un ARRAYLIST
				
			//Lanzamos la ventana Principal
				vInicio = new Inicio();
			//Cargamos datos de usuarios en el JcomboBox
				showVistasLogin();
			//Mostramos la vista Principal
				vInicio.setVisible(true);
		}
		//Lanzar Principal
		public void showInicio(){
			//Cargamos la vista Principal y le enviamos los usuarios 
				if (this.auth.estaLogado()){
					
					vInicio.showVistasLogin(Usuarios);
					vInicio.showMensaje("Sesión iniciada");

				} else {
					
					//aquí mensaje de error por pantalla
					vInicio.showMensaje("Debes logearte antes");
				};
		}
		public void showVistasLogin() {
			
			if (this.auth.estaLogado()){
				vInicio.showVistasLogin(Usuarios);
				vInicio.showMensaje("Sesión iniciada");

			} else {
				
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};	
		}
		public void showVistasPerfil(){
			if (this.auth.estaLogado()){
				vInicio.showVistasPerfil();
				vInicio.showMensaje("Sesión iniciada");

			} else {
				
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		public void showVistasGastos(){
			if (this.auth.estaLogado()){
				if(Gasto==null)gasto=new ModeloGastos();
				ArrayList<ObjGastos> Gasto= gasto.getGasto();
				vInicio.showVistasGastos(Gasto);
				vInicio.showMensaje("Sesión iniciada");

			} else {
				
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		public void showVistasIngresos(){
			if (this.auth.estaLogado()){
				vInicio.showVistasIngresos();
				vInicio.showMensaje("Sesión iniciada");

			} else {
				
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		public void logar(){
			this.auth.comprobarUser();
			vInicio.showMensaje("Logado!");
		}
}
