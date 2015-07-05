package Modelo;

public class Game {
	
	//Atributos
	int id=0;
	private  String Mes="";
	private  String NomGF="";
	private  String ImportGF=" ";
	private  String TotalGF=" ";
	private  String NomGV="";
	private  String ImportGV="";
	private  String TotalGV="";
	private  String TotalGastos="";
public Game(int id,String Mes,String NomGF,String ImportGF,String TotalGF,String NomGV,String ImportGV,String TotalGV,String TotalGastos) {
this.id=id;
this.Mes=Mes;
this.NomGF=NomGF;
this.ImportGF=ImportGF;
this.TotalGF=TotalGF;
this.NomGV=NomGV;
this.ImportGV=ImportGV;
this.TotalGV=TotalGV;
this.TotalGastos=TotalGastos;
}
public int getid(){
return this.id;
}
public String getMes(){
return this.Mes;
}

public String getImportGF(){
return this.ImportGF;
}
public String getTotalGF(){
return this.TotalGF;
}
public String toString(){
return this.Mes;
}
}
