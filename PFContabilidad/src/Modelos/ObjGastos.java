/*Definimos la clase que recojera los objetos que compone nuestra bd*/

package Modelos;

public class ObjGastos {
	//Definimos nuestro atributos
		int id=0;	
		private  String Mes="";
		private  String NomGF="";
		private  String ImportGF=" ";
		private  String TotalGF=" ";
		private  String NomGV="";
		private  String ImportGV="";
		private  String TotalGV="";
		private  String TotalGastos="";
			
	public ObjGastos(int id,String Mes,String NomGF,String ImportGF,String TotalGF,String NomGV,String ImportGV,String TotalGV,String TotalGastos) {
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
	public void setMes(String Mes){
		this.Mes=Mes;
	}
	
	public String getNomGF(){
		return this.NomGF;
	}
	public void setNomGF(String NomGF){
		this.NomGF=NomGF;
	}
	
	public String getImportGF(){
		return this.ImportGF;
	}
	public void setImportGF(String ImportGF){
		this.ImportGF=ImportGF;
	}
	
	public String getTotalGF(){
		return this.TotalGF;
	}
	public void setTotalGF(String TotalGF){
		this.TotalGF=TotalGF;
	}
	
	public String getNomGV(){
		return this.NomGV;
	}
	public void setNomGV(String NomGV){
		this.NomGV=NomGV;
	}
	
	public String getImportGV(){
		return this.ImportGV;
	}
	public void setImportGV(String ImportGV){
		this.ImportGV=ImportGV;
	}
	
	public String getTotalGV(){
		return this.TotalGV;
	}
	public void setTotalGV(String TotalGV){
		this.TotalGV=TotalGV;
	}
	
	public String getTotalGastos(){
		return this.TotalGastos;
	}
	public void setTotalGastos(String TotalGastos){
		this.TotalGastos=TotalGastos;
	}
	//Nos permite imprimir en nuestros list el nombre del mes
	public String toString(){
		return this.Mes;
	}
}
