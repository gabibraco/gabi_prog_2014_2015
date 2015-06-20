package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloIngresos {
	//Consulta de nombres de usuarios
	private final static String Ingresos_SEL="SELECT * FROM ingresos";
	private final static String ID_COL="id";
	private final static String Mes_COL="Mes";
	private final static String NomIF_COL="NomIF";
	private final static String ImportIF_COL="ImportIF";
	private final static String TotalIF_COL="TotalIF";
	private final static String NomIV_COL="NomIV";
	private final static String ImportIV_COL="ImportIV";
	private final static String TotalIV_COL="TotalIV";
	private final static String TotalIngresos_COL="TotalIngresos";
	
//Conexion
	private Connection conexion=null;
	Statement instruccion=null;
	ResultSet conjuntoResultados=null;	
	
//Declaramos nuestro ArrayList
	private ArrayList<ObjIngresos> Ingreso=null;
	
	public ModeloIngresos() {
		//Obtenemos la conexion de datos
			ConexionDB cdb = ConexionDB.getInstance();
			conexion = ConexionDB.getConexion();
				//Inicializamos el Array
				Ingreso=new ArrayList<ObjIngresos>();
	}
	
	public ArrayList getIngreso(){
		try{
			//Crea el statement para la conexion( prepara la conexion)
			instruccion=this.conexion.createStatement();
			//Pide los datos de la tabla usuarios ( o los recoje)
			conjuntoResultados=instruccion.executeQuery(Ingresos_SEL);
			Ingreso.clear();
			//Listaremos por pantalla los datos
			while(conjuntoResultados.next()){
			//Aqui añadimos el nombre de usuario al ArrayList usuarios
				ObjIngresos NIngreso=new ObjIngresos(conjuntoResultados.getInt(ID_COL),
							 conjuntoResultados.getString(Mes_COL),
							 conjuntoResultados.getString(NomIF_COL),
							 conjuntoResultados.getString(ImportIF_COL),
							 conjuntoResultados.getString(TotalIF_COL),
							 conjuntoResultados.getString(NomIV_COL),
							 conjuntoResultados.getString(ImportIV_COL),
							 conjuntoResultados.getString(TotalIV_COL),
							 conjuntoResultados.getString(TotalIngresos_COL)
							 );	
				Ingreso.add(NIngreso);}
		return Ingreso;}
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
				return Ingreso;	
			}
	
}
