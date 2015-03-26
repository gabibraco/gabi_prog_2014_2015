import Modelo.ConexionDB;
import Modelo.UsuariosModel;
import Vista.*;
import java.sql.Connection;

public class GamesDBApp {
	ConexionDB gameDB;
	public static void main(String[] args) {
		//ESTABLECIENDO LA CONEXION A LA BBDD y GENERANDO EL OBJETO
		ConexionDB Usuarios=new ConexionDB("localhost","gamedb","root","damdaw2015");
		
		//INTENTA CONECTARTE
		if(Usuarios.connectDB()==true){
			
			// SI SE CONSIGUE MUESTRA POR PANTALLA ESTO
			System.out.println("CONECTADOS CON EXITO");
		}
		//SI NO SE CONSIGUE MUESTRA POR PANTALLA ESTO 
		else System.out.println("ERROR EN LA CONEXION");
		
		//GENERAMOS EL OBJETO Y LO HACEMOS VISIBLE.
		VistaApp frame = new VistaApp();
		frame.setVisible(true);
		

	}

}
