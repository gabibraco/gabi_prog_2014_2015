package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JuegosModel {
	
	//Consulta que devuelve el nombre de usuarios
	
	private final static String Gastos_SEL="SELECT * FROM gastos";
	private final static String ID_COL="id";
	private final static String Mes_COL="Mes";
	private final static String NomGF_COL="NomGF";
	private final static String ImportGF_COL="ImportGF";
	private final static String TotalGF_COL="TotalGF";
	private final static String NomGV_COL="NomGV";
	private final static String ImportGV_COL="ImportGV";
	private final static String TotalGV_COL="TotalGV";
	private final static String TotalGastos_COL="TotalGastos";
		



		ConexionDB cdb ;
			
		//Conexion 
		private Connection conexion = null;
		Statement instruccion = null; // Instrucción de consulta 
		ResultSet conjuntoResultados = null;
		
		
		//declaro juegos
		
		private ArrayList<Game> juegos = null;
		
		public JuegosModel(){     
					//inicializamos el array de juegos
			juegos = new ArrayList<Game>();
			cdb = ConexionDB.getInstance("localhost","gamedb","root02","PROGBD2015"); 
			conexion = cdb.getConexion();
				}
		
		
		public JuegosModel(Connection conexion){    
			this.conexion=conexion;
				}
		   
		
		
		public ArrayList getJuegos(){   //METODO GET PARA OBTENER LOS Juegos
			try{			
				instruccion = conexion.createStatement(); //prepara la conexion
				conjuntoResultados = instruccion.executeQuery(Gastos_SEL); //esta linea ejecuta la petición a la bbdd.
				
				juegos.clear(); //este metodo hará que no se vuelva a cargar al volver a la ventana
				
					//cargamos al objeto los datos
				
					while( conjuntoResultados.next() ) {
						Game game=new Game(
								conjuntoResultados.getInt(ID_COL),
								 conjuntoResultados.getString(Mes_COL),
								 conjuntoResultados.getString(NomGF_COL),
								 conjuntoResultados.getString(ImportGF_COL),
								 conjuntoResultados.getString(TotalGF_COL),
								 conjuntoResultados.getString(NomGV_COL),
								 conjuntoResultados.getString(ImportGV_COL),
								 conjuntoResultados.getString(TotalGV_COL),
								 conjuntoResultados.getString(TotalGastos_COL));
						juegos.add(game);

					}// fin de while
					

					return juegos;

			}
			 
			
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
				return juegos;

			}
			
		}
		

}