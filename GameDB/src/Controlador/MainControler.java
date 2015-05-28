/***************************************************************************************************************
 * *************************************************************************************************************
 * Instalamos el MainController que se encargara, que cualquier accion que se producta en vista va a ser ella la 
encargada de ejecutarla , ya no va a ser la vista la encargada de interactuar con el usuario y va a saber en todo 
momento el estado de la aplicacion.******************************************************************************
*****************************************************************************************************************
*****************************************************************************************************************/

package Controlador;

import java.util.ArrayList;
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
			//Usuarios
			private ArrayList<String> Usuarios;
			UsuariosModel usuarios;
	private MainControler() {
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
	public static MainControler getInstance(){
		if (instance == null){
			instance=new MainControler();
		}
		
		return instance;	
	}
	//Lanzar la vista inicial
	public void showMain(){
		//Cargamos los modelos necesarios para esta vista a traves del modeloUsuario
		usuarios=new UsuariosModel();//llama a usuarios
		ArrayList<String> Usuarios= usuarios.getUsuarios();//convertimos usuarios en un ARRAYLIST
		//Lanzamos la ventana Principal
		vApp = new VistaApp();
		//Cargamos datos de usuarios en el JcomboBox
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
	