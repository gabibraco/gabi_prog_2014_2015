package Modelo;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;


public class UsuariosModel {
	//Consulta que devuelve el nombre de usuarios
	
	private  static String Usuarios_SEL="SELECT * FROM Usuarios";	// estos deben ser static final , constantes en  mayusculas!
	private  static String Usuarios_COL="Usuarios";
	ConexionDB cdb ;
		
	//Conexion
	private Connection conexion = null;
	Statement instruccion = null; // Instrucci�n de consulta 
	ResultSet conjuntoResultados = null;
	
	
	//declaro objetousuarios
	
	private ArrayList<String> objetousuarios = null;
	
	public UsuariosModel(){    
				//inicializamos el array de objetousuarios
		objetousuarios = new ArrayList<String>();
		cdb = ConexionDB.getInstance("localhost","gamedb","root","PROGBD2015"); 
		conexion = cdb.getConexion();
			}
	
	
	public UsuariosModel(Connection conexion){    
		this.conexion=conexion;
			}
	   
	
	
	public ArrayList getUsuarios(){   //METODO GET PARA OBTENER LOS USUARIO
		try{			
			instruccion = conexion.createStatement(); //prepara la conexion
			conjuntoResultados = instruccion.executeQuery(Usuarios_SEL); //esta linea ejecuta la petici�n a la bbdd.
			objetousuarios.clear();
			//cargamos al objeto los datos
			
				while( conjuntoResultados.next() ) {
				objetousuarios.add(conjuntoResultados.getString(Usuarios_COL));
				}// fin de while
			

				return objetousuarios;

		}
		 
		
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return objetousuarios;

		}
		
	}
	
	
} //FINAL DE CLASE USUARIOSMODEL