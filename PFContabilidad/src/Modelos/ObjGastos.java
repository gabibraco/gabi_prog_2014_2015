package Modelos;

public class ObjGastos {
	//Definimos nuestro atributos
			
			private  String Mes="";
			private  String NomGF="";
			private  String ImportGF=" ";
			private  String TotalGF=" ";
			private  String NomGV="";
			private  String ImportGV="";
			private  String TotalGV="";
			private  String TotalGastos="";
	public ObjGastos(String Mes,String NomGF,String ImportGF,String TotalGF,String NomGV,String ImportGV,String TotalGV,String TotalGastos) {
		
		this.Mes=Mes;
		this.NomGF=NomGF;
		this.ImportGF=ImportGF;
		this.TotalGF=TotalGF;
		this.NomGV=NomGV;
		this.ImportGV=ImportGV;
		this.TotalGV=TotalGV;
		this.TotalGastos=TotalGastos;
	}
	
	public String getMes(){
	return this.Mes;
	}
	public String getNomGF(){
		return this.NomGF;
	}
	public String getImportGF(){
		return this.ImportGF;
	}
	public String getTotalGF(){
		return this.TotalGF;
	}
	public String getNomGV(){
		return this.NomGV;
	}
	public String getImportGV(){
		return this.ImportGV;
	}
	public String getTotalGV(){
		return this.TotalGV;
	}
	public String getTotalGastos(){
		return this.TotalGastos;
	}
	public String toString(){
		return this.Mes;
	}
}
