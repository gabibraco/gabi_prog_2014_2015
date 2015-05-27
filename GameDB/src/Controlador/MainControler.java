package Controlador;


import java.util.ArrayList;
import java.util.Iterator;
import Modelo.ConexionDB;
import Modelo.UsuariosModel;
import Vista.VistaApp;


public class MainControler {
			//Instancia Unica
			private static MainControler instance = null;
			//Atributos de la base de datos
			ConexionDB gamedb;
			//Auntenticador
			//private User usuarioRegistrado = null;
			//Vistas
			private VistaApp vApp;
			private ArrayList<String> Usuarios;
			private UsuariosModel usuarios;
	private MainControler() {
		//ESTABLECIENDO LA CONEXION A LA BBDD y GENERANDO EL OBJETO
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
	public static MainControler getInstance(){
		if (instance == null){
			instance=new MainControler();
		}
		
		return instance;	
	}
	//Lanzar la vista inicial
	public void showMain(){
		//Cargamos los modelos necesarios para esta vista
		usuarios=new UsuariosModel();
		Usuarios= usuarios.getUsuarios();
		//Lanzamos la ventana Principal
		vApp = new VistaApp();
		//Cargamos datos de usuarios
		 vApp.showVistaPrincipal(Usuarios);
		//Mostramos la vista Principal
		vApp.setVisible(true);
	}
	//Lanzamos Juegos
	public void showJuegos(){
		vApp.showvJuegos();
	}
	//Lanzar Principal
	public void showInicio(){
	//Cargamos la vista Principal y le enviamos los usuarios 
	vApp.showVistaPrincipal(Usuarios);
	}	
}
	