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
		
	/*Generamos el objeto gamedb para que se conecte a la bbdd que hemos creado previamente. Mediante el metodo le pasamos los datos.
	 * Si la conexion es correcta nos mostrara por pantalla que esta bien sino nos dara error por pantalla*/
		gameDB=ConexionDB.getInstance("localhost","gamedb","root02","PROGBD2015") ; 
	
			if(gameDB.connectDB()==true) {
				System.out.println("CONECTADOS CON EXITO");	
				}	
				else {System.out.println("ERROR EN LA CONEXION");
				}
				this.showInicio();
				}
	
	
	
	/*Implementar SingleTon, nuestra instancia unica que nos permitira interactuar con la base de datos*/
		public static MainControler getInstance() {
		     if(instance == null) {
		        instance = new MainControler();
		     }
		     return instance;
			 }
/*Generamos unos metodos para poder cargar los diferentes datos en nuestras pantallas(Sino daba error)*/
		
		//metodo para cargar los usuarios
		public Iterator<String> CargarUsuarios(){	
			System.out.println("cargamos usuarios");
			UsuariosModel cargadeusuarios = new UsuariosModel();
			Iterator<String> it= cargadeusuarios.getUsuarios().iterator();
		return it; }
		
		//metodo para cargar los Gastos
		public ArrayList<ObjGastos> CargarGastos(){		
			System.out.println("cargamos gastos");
			ModeloGastos cargadegastos = new ModeloGastos();
			ArrayList<ObjGastos> it2= cargadegastos.getGasto();
		return it2; }
		
		//metodo para cargar los Ingresos
		public ArrayList<ObjIngresos> CargarIngresos(){		
			System.out.println("cargamos ingresos");
			ModeloIngresos cargadeingresos = new ModeloIngresos();
			ArrayList<ObjIngresos> it3= cargadeingresos.getIngreso();
		return it3; }
		
		//metodo para cargar los Perfiles
		public ArrayList<ObjetoPerfil> CargarPerfiles(){		
			System.out.println("cargamos perfiles");
			PerfilModel cargadeperfiles = new PerfilModel();
			ArrayList<ObjetoPerfil> it4= cargadeperfiles.getPerfil();
		return it4; }
		
/*Metodos para cargar nuestras Vistas o diferentes ventanas*/		
		//metodo al que llamamos para crear la ventana principal
		public void showInicio(){
			//Lanzamos la ventana Vistaapp
			vInicio=  Inicio.getInstance();	
			//creamos el objeto usuarios de la case UsuariosModel
			usuarios=new UsuariosModel();
			//creamos el objetos de nuestras diferentes clases
			gastos= new ModeloGastos();
			ingresos= new ModeloIngresos();
			perfil=new PerfilModel();
			//hacemos visible por defecto solo puede haber una entrada show
			vInicio.setVisible(true);
			//llamamos a showvLogin
			this.showvLogin();
		}
		
		//metodo al que llamamos para hacer visible el panel Login
		public void showvLogin(){
			//en el metodo showvLogin muestra nuestra pantalla de inicio y nos carga los usuarios
				vInicio.showvLogin(CargarUsuarios());
			//Autenticador(Comprueba que estamos logados
			if (this.auth.estaLogado()){
				vInicio.showMensaje("Sesión iniciada");
			} else {
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		
		
		//metodo al que llamamos para hacer visible el panel Gasto
		public void showvGasto(){
			//en el metodo showVistaGasto, y autenticar
			if (this.auth.estaLogado()){
				vInicio.showvGasto(this.CargarGastos());
				vInicio.showMensaje("Sesión iniciada");
			} else {
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		//Metodo para poder actualizar los datos en la table atraves del boton
		public void updateGasto (ObjGastos NGasto){
			gastos.updateGastos(NGasto);
			this.showvGasto();
		}
		
		
		//metodo al que llamamos para hacer visible el panel Ingresos
		public void showvIngresos(){
			//en el metodo showVistaIngresos y autenticar
			if (this.auth.estaLogado()){
				vInicio.showvIngresos(this.CargarIngresos());
				vInicio.showMensaje("Sesión iniciada");
			} else {
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		
		//metodo al que llamamos para hacer visible el panel Perfil
		public void showvPerfil(){
			//en el metodo showVistaPerfil y autenticar 
			if (this.auth.estaLogado()){
				vInicio.showvPerfil(this.CargarPerfiles());
				vInicio.showMensaje("Sesión iniciada");
			} else {
				//aquí mensaje de error por pantalla
				vInicio.showMensaje("Debes logearte antes");
			};
		}
		
		//Metodo logar para comprobar si se esta logado
		public void logar() {
			this.auth.comprobarUser();
			vInicio.showMensaje("logeado!");

		}
	
		
       
}