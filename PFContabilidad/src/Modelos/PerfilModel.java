package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Modelos.ObjetoPerfil;

public class PerfilModel {
	//Consulta de nombres de usuarios
		private final static String Usuarios_SEL="SELECT * FROM Usuarios";
		private final static String Usuarios_Usuario="Usuarios";
		private final static String Usuarios_Nomb="Nombre";
		private final static String Usuarios_Apell="Apellidos";
		private final static String Usuarios_Direcc="Direccion";
		private final static String Usuarios_Email="Email";
		private final static String Usuarios_NIF="NIF";
		private final static String Usuarios_Edad="Edad";
		
		//Conexion
		private ConexionDB gameDB=null;
		private Statement instruccion=null;
		private ResultSet conjuntoResultados=null;	
		
		//Declaramos nuestro ArrayList
		private ArrayList<ObjetoPerfil> Perfil=null;
		
	public PerfilModel() {
		//Obtenemos la conexion de datos
		gameDB=ConexionDB.getInstance();
		//Inicializamos el Array
		Perfil=new ArrayList<ObjetoPerfil>();
	}
	public ArrayList getPerfil(){
		try{
			//Crea el statement para la conexion( prepara la conexion)
			instruccion=gameDB.getConexion().createStatement();
			//Pide los datos de la tabla usuarios ( o los recoje)
			conjuntoResultados=instruccion.executeQuery(Usuarios_SEL);
			Perfil.clear();
			//Listaremos por pantalla los datos
			while(conjuntoResultados.next()){
			//Aqui añadimos el nombre de usuario al ArrayList usuarios
				ObjetoPerfil NPerfil=new ObjetoPerfil(conjuntoResultados.getString(Usuarios_Usuario),
							 conjuntoResultados.getString(Usuarios_Nomb),
							 conjuntoResultados.getString(Usuarios_Apell),
							 conjuntoResultados.getString(Usuarios_Direcc),
							 conjuntoResultados.getString(Usuarios_Email),
							 conjuntoResultados.getString(Usuarios_NIF),
							 conjuntoResultados.getString(Usuarios_Edad));	
				Perfil.add(NPerfil);}
		return Perfil;}
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
				return Perfil;	
			}
}
