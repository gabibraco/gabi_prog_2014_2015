package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;

import Modelos.ObjGastos;
import Controller.MainControler;
import Modelos.ConexionDB;
import Vistas.Gastos;

public class ModeloGastos {
	//Consulta de nombres de usuarios
			private final static String Gastos_SEL="SELECT * FROM gastos";
			private final static String id_COL="id";
			private final static String Mes_COL="Mes";
			private final static String NomGF_COL="NomGF";
			private final static String ImportGF_COL="ImportGF";
			private final static String TotalGF_COL="TotalGF";
			private final static String NomGV_COL="NomGV";
			private final static String ImportGV_COL="ImportGV";
			private final static String TotalGV_COL="TotalGV";
			private final static String TotalGastos_COL="TotalGastos";
			
	//UPDATE
			private final static String Gastos_UPDATE="UPDATE gastos set "+Mes_COL+"=?,"+NomGF_COL+"=?,"+ImportGF_COL+"=?,"+TotalGF_COL+"=?,"+NomGV_COL+"=?,"+ImportGV_COL+"=?,"+TotalGV_COL+"=?,"+TotalGastos_COL+"=? where id"+"=?";
	//Conexion
			private Connection conexion=null;
			Statement instruccion=null;
			ResultSet conjuntoResultados=null;	
			
	//Declaramos nuestro ArrayList
			private ArrayList<ObjGastos> Gasto=null;
			
	public ModeloGastos() {
		//Obtenemos la conexion de datos
				ConexionDB cdb = ConexionDB.getInstance();
				conexion = ConexionDB.getConexion();
				//Inicializamos el Array
				Gasto=new ArrayList<ObjGastos>();
				
			}
	
	public ArrayList getGasto(){
		try{
			//Crea el statement para la conexion( prepara la conexion)
			instruccion=this.conexion.createStatement();
			//Pide los datos de la tabla usuarios ( o los recoje)
			conjuntoResultados=instruccion.executeQuery(Gastos_SEL);
			Gasto.clear();
			//Listaremos por pantalla los datos
			while(conjuntoResultados.next()){
			//Aqui añadimos el nombre de usuario al ArrayList usuarios
				ObjGastos NGasto=new ObjGastos(
							 conjuntoResultados.getInt(id_COL),
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
						return Gasto;	
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
					
		}
	//Metodo pasa actualizar los datos de la bd que nos permite conectarnos a ella
	public void updateGastos(ObjGastos NGasto){
		try{
			PreparedStatement pst= this.conexion.prepareStatement(Gastos_UPDATE);
			pst.setString(1,NGasto.getMes());
			pst.setString(2,NGasto.getNomGF());
			pst.setString(3,NGasto.getImportGF());
			pst.setString(4,NGasto.getTotalGF());
			pst.setString(5,NGasto.getNomGV());
			pst.setString(6,NGasto.getImportGV());
			pst.setString(7,NGasto.getTotalGV());
			pst.setString(8,NGasto.getTotalGastos());
			pst.setInt(9,NGasto.getid());
			pst.executeUpdate();
			}
		catch(SQLException exceptionSql){
			exceptionSql.printStackTrace();
			}
		
	}
	
}


