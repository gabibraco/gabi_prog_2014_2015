package Modelos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import Controller.MainController;
import Modelos.ConexionDB;
import Vistas.Gastos;
public class ModeloGastos {
	//Consulta de nombres de usuarios
			private final static String Gastos_SEL="SELECT * FROM gastos";
			private final static String ID_COL="id";
			private final static String Mes_COL="Mes";
			private final static String NomGF_COL="NomGF";
			private final static String ImportGF_COL="ImportGF";
			private final static String TotalGF_COL="TotalGF";
			private final static String NomGV_COL="NomGV";
			private final static String ImportGV_COL="ImportGV";
			private final static String TotalGV_COL="TotalGV";
			private final static String TotalGastos_COL="Total";
			
	//Conexion
			private Connection conexion=null;
			private Statement instruccion=null;
			private ResultSet conjuntoResultados=null;	
			
	//Declaramos nuestro ArrayList
			private ArrayList<ObjGastos> Gasto=null;
			
	public ModeloGastos() {
		//Obtenemos la conexion de datos
				conexion = (Connection) ConexionDB.getInstance();
				//Inicializamos el Array
				Gasto=new ArrayList<ObjGastos>();
				
			}
	
	public ArrayList<ObjGastos> getGasto(){
		try{
			//Crea el statement para la conexion( prepara la conexion)
			instruccion=this.conexion.createStatement();
			//Pide los datos de la tabla usuarios ( o los recoje)
			conjuntoResultados=instruccion.executeQuery(Gastos_SEL);
			Gasto.clear();
			//Listaremos por pantalla los datos
			while(conjuntoResultados.next()){
			//Aqui añadimos el nombre de usuario al ArrayList usuarios
				ObjGastos NGasto=new ObjGastos(conjuntoResultados.getInt(ID_COL),
							 conjuntoResultados.getString(Mes_COL),
							 conjuntoResultados.getString(NomGF_COL),
							 conjuntoResultados.getString(ImportGF_COL),
							 conjuntoResultados.getString(TotalGF_COL),
							 conjuntoResultados.getString(NomGV_COL),
							 conjuntoResultados.getString(ImportGV_COL),
							 conjuntoResultados.getString(TotalGV_COL),
							 conjuntoResultados.getString(TotalGastos_COL));	
				Gasto.add(NGasto);}
		return Gasto;
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
				return Gasto;	
			}


	}


