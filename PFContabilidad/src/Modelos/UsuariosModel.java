package Modelos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class UsuariosModel {
	
	//Consulta de nombres de usuarios
	private final static String Usuarios_SEL="SELECT * FROM Usuarios";
	private final static String Usuarios_COL="Usuarios";
	
	
	//Conexion
	ConexionDB gameDB;
	private Statement instruccion;
	private ResultSet conjuntoResultados;
	
	//UsuariosDB(tendra los nombres de los usuarios a los que queremos acceder.
	private ArrayList<String>Usuarios;
	
	
	public UsuariosModel() {
		
		//Obtenemos la conexion de datos
		gameDB=ConexionDB.getInstance();
		
		//Iniciamos el Array de Usuarios
		Usuarios=new ArrayList<String>();
	}
	public ArrayList<String> getUsuarios(){
		
		try{
				//Crea el statement para la conexion( prepara la conexion)
				instruccion=gameDB.getConexion().createStatement();
				//Pide los datos de la tabla usuarios ( o los recoje)
				conjuntoResultados=instruccion.executeQuery(Usuarios_SEL);
			
				//Listaremos por pantalla los datos
				while(conjuntoResultados.next()){
				//Aqui añadimos el nombre de usuario al ArrayList usuarios
					Usuarios.add(conjuntoResultados.getString(Usuarios_COL));
				}
				//Devolvemos usuarios del Arraylist.
				return Usuarios;
		}
		//En caso de no realizarse con exito devuelve usuarios
		catch (SQLException exceptionSql){
				exceptionSql.printStackTrace();	
		}
		finally {
				try{
					//Cierra la Recopilacion de datos
					conjuntoResultados.close();
					//Cierra la instruccion
					instruccion.close();	
			}
				catch(SQLException exceptionSql){
					exceptionSql.printStackTrace();
			}
		}
		return Usuarios;	
	}
}
		

	
