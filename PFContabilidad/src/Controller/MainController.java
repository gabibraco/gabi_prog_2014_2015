package Controller;
import java.util.ArrayList;

import Modelos.ConexionDB;
import Modelos.UsuariosModel;
import Vistas.Inicio;
import Vistas.Login;

public class MainController {
	//Instancia Unica
	private static MainController instance = null;
	//Atributos de la base de datos
	ConexionDB gamedb;
	//Auntenticador
	//private User usuarioRegistrado = null;
	//Vistas
	Inicio vApp;
	//Usuarios
	private ArrayList<String> Usuarios;
	UsuariosModel usuarios;
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
usuarios=new UsuariosModel();//llama a usuarios
ArrayList<String> Usuarios= usuarios.getUsuarios();//convertimos usuarios en un ARRAYLIST
//Lanzamos la ventana Principal
vApp = new Inicio();
//Cargamos datos de usuarios en el JcomboBox
vApp.showVistasLogin(Usuarios);
//Mostramos la vista Principal
vApp.setVisible(true);
}
//Lanzar Principal
public void showInicio(){
//Cargamos la vista Principal y le enviamos los usuarios 
	vApp.showVistasLogin(Usuarios);
}	
//Lanzamos Juegos

public void showVistasPerfil(){
vApp.showVistasPerfil();
}
public void showVistasGastos(){
vApp.showVistasGastos();
}
public void showVistasIngresos(){
vApp.showVistasIngresos();
}



}

	

