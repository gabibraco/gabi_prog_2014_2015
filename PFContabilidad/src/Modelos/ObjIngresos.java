package Modelos;

public class ObjIngresos {
	//Definimos nuestro atributos
	int id=0;
	private  String Mes="";
	private  String NomIF="";
	private  String ImportIF=" ";
	private  String TotalIF=" ";
	private  String NomIV="";
	private  String ImportIV="";
	private  String TotalIV="";
	private  String TotalIngresos="";
public ObjIngresos(int id,String Mes,String NomIF,String ImportIF,String TotalIF,String NomIV,String ImportIV,String TotalIV,String TotalIngresos) {
	this.id=id;
	this.Mes=Mes;
	this.NomIF=NomIF;
	this.ImportIF=ImportIF;
	this.TotalIF=TotalIF;
	this.NomIV=NomIV;
	this.ImportIV=ImportIV;
	this.TotalIV=TotalIV;
	this.TotalIngresos=TotalIngresos;
}
	public int getid(){
		return this.id;
	}
	public String getMes(){
		return this.Mes;
	}
	public String getNomIF(){
		return this.NomIF;
	}
	public String getImportIF(){
		return this.ImportIF;
	}
	public String getTotalIF(){
		return this.TotalIF;
	}
	public String getNomIV(){
		return this.NomIV;
	}
	public String getImportIV(){
		return this.ImportIV;
	}
	public String getTotalIV(){
		return this.TotalIV;
	}
	public String getTotalIngresos(){
		return this.TotalIngresos;
	}
}

