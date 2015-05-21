package Modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConexionDB {
	// DATOS DE LA CONEXION
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS DE LA BBDD
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	
	//DATOS POR DEFECTO
	private static final String HOST="localhost";
	private static final String BBDD="gamedb";
	private static final String USER="root02";
	private static final String PASS="PROGBD2015";
	
	//Conexion
	private static Connection conexion = null;// maneja la conexió
	
	//instancia unica
	private static ConexionDB instance=null;
	
//Declaramos la conexion	
	private ConexionDB(String HOST,String BBDD,String USER,String PASS) {
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
		
	}
//Implementar Singelton
	public static ConexionDB getInstance(String HOST,String BBDD,String USER,String PASS){
		if(instance==null){
			instance=new ConexionDB(HOST,BBDD,USER,PASS);
		}
		return instance;
	}
	public static ConexionDB getInstance(){
		if(instance==null){
			instance=new ConexionDB(ConexionDB.HOST,ConexionDB.BBDD,ConexionDB.PASS,ConexionDB.USER);
		}
		return instance;
	}
	public boolean connectDB(){
		try{
			
			//Lo primero es cargar el controlador MySQL el cual automáticamente se registra
			Class.forName(CONTROLADOR_MYSQL);
			//Conectarnos a la BBDD cargamos DriverManager
			conexion = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd,this.user,this.pass);
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return false;
		}
		catch( ClassNotFoundException noEncontroClase)
		{
			noEncontroClase.printStackTrace();
			return false;
		}
		return true;
	}
	//generamos metodo estatico que nos devuelve conexion
	public Connection getConexion(){
		return conexion;
	}

}