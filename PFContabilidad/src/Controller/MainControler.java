/***************************************************************************************************************
 * *************************************************************************************************************
 * Instalamos el MainController que se encargara, que cualquier accion que se producta en vista va a ser ella la 
encargada de ejecutarla , ya no va a ser la vista la encargada de interactuar con el usuario y va a saber en todo 
momento el estado de la aplicacion.******************************************************************************
*****************************************************************************************************************
*****************************************************************************************************************/

package Controller;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;
import Controller.MainControler;
import Modelos.ConexionDB;
import Modelos.UsuariosModel;
import Modelos.ModeloGastos;
import Modelos.ObjGastos;
import Modelos.ObjIngresos;
import Modelos.ModeloIngresos;
import Modelos.ObjetoPerfil;
import Modelos.PerfilModel;
import Vistas.Inicio;
import Vistas.Login;
import Vistas.Gastos;
import Vistas.Ingresos;
import Vistas.Perfil;

public class MainControler {
	
//Atributos :

	//BBDD;

		private ConexionDB gameDB;
	
	//Instancia unica
		private static MainControler instance = null;
		
		
	//Vistas
		private	Inicio vInicio;
		
	//Modelos
		
		UsuariosModel usuarios;
		ModeloGastos gastos;
		ModeloIngresos ingresos;
		PerfilModel perfil;
	
	//autenticacion
		public Autenticar auth = new Autenticar();

	
	private MainControler() {
		//Instanciar MainController mediante metodo privado. 
		
	//Generamos el objeto gamedb para que se conecte a la bbdd que hemos creado previamente. Mediante el metodo le pasamos los datos
	gameDB=ConexionDB.getInstance("localhost","gamedb","root02","PROGBD2015") ; 
	
	
	if(gameDB.connectDB()==true) {
		System.out.println("CONECTADOS CON EXITO");	
	}	
	else {System.out.println("ERROR EN LA CONEXION");
	}
	
	this.showInicio();
	}
	
	
	
	//Implementar SingleTon
		public static MainControler getInstance() {
		      if(instance == null) {
		         instance = new MainControler();
		      }
		      return instance;
		}
	
		
		//metodo para cargar los usuarios
		public Iterator<String> CargarUsuarios(){	
			System.out.println("cargamos usuarios");
			UsuariosModel cargadeusuarios = new UsuariosModel();
			Iterator<String> it= cargadeusuarios.getUsuarios().iterator();
		return it; }
		
		//metodo para cargar los juegos
		public ArrayList<ObjGastos> CargarGastos(){		
			System.out.println("cargamos gastos");
			ModeloGastos cargadegastos = new ModeloGastos();
			ArrayList<ObjGastos> it2= cargadegastos.getGasto();
		return it2; }
		
		public ArrayList<ObjIngresos> CargarIngresos(){		
			System.out.println("cargamos ingresos");
			ModeloIngresos cargadeingresos = new ModeloIngresos();
			ArrayList<ObjIngresos> it3= cargadeingresos.getIngreso();
		return it3; }
		
		
		
		//metodo al que llamamos para crear la ventana principal
		public void showInicio(){
			
			//Lanzamos la ventana Vistaapp
			vInicio=  Inicio.getInstance();	
			
			
			// creamos el objeto usuarios de la case UsuariosModel
			usuarios=new UsuariosModel();
			
			// creamos el objeto juegos de la clase JuegosModel
			gastos= new ModeloGastos();
			
			ingresos= new ModeloIngresos();
			//hacemos visible por defecto solo puede haber una entrada show
			vInicio.setVisible(true);
			
			//llamamos a showVistaPrin
			this.showvLogin();
			
		}
		
		//metodo al que llamamos para hacer visible el panel VistaPrin
		public void showvLogin(){
			//en el metodo showVistaPrin,lanzamos metodo de objetovistaapp
			vInicio.showvLogin(CargarUsuarios());
		}
		
		//metodo al que llamamos para hacer visible el panel juegos
		public void showvGasto(){
			//en el metodo showVistaJuegos,lanzamos metodo de objetovistajuegos
			if (this.auth.estaLogado()){
				vInicio.showvGasto(this.CargarGastos());
				vInicio.showMensaje("Sesión iniciada");
			} else {
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		public void showvIngresos(){
			//en el metodo showVistaJuegos,lanzamos metodo de objetovistajuegos
			if (this.auth.estaLogado()){
				vInicio.showvIngresos(this.CargarIngresos());
				vInicio.showMensaje("Sesión iniciada");
			} else {
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		
		public void logar() {
			this.auth.comprobarUser();
			vInicio.showMensaje("logeado!");

		}
	
		
       
}