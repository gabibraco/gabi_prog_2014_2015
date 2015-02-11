
public class DatosGenerales {
	
	//Lista de monedas y valores declaradas como constantes al ser final static
	//de tipo String y de tipo float.
	final static String MONEDA_DOL="Dolares";
	final static float Valor_DOL=0.75f;
	final static String MONEDA_EUR="Euros";
	final static float Valor_EUR=1f;
	final static String MONEDA_LIB="Libras";
	final static float Valor_LIB=1.5f;
	final static String MONEDA_YEN="Yen";
	final static float Valor_YEN=2.1f;
	
	//Arrays con las listas de monedas y valores 
	private String textoMoneda[]={MONEDA_DOL,MONEDA_EUR,MONEDA_LIB,MONEDA_YEN};
	private float ValoresConversionMonedasAEuros[]={Valor_DOL,Valor_EUR,Valor_LIB,Valor_YEN};
	
	//Constructor de la clase Datos Generales
	
	public DatosGenerales() {
		
	 	
	}
	
	//Creacion de clase publica de tipo String y Array
	public String [] getMonedas(){
		//Lo que nos devuelve esta clase 
		return textoMoneda;
		
	}
	//Creacion de clase publica de tipo String y Array
	public float [] getValoresAEuros(){
		//Lo que nos devuelve esta clase	
		return ValoresConversionMonedasAEuros;
	}
}
