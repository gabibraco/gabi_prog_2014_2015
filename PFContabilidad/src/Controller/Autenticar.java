package Controller;
/*Creamos la Clase autenticar que nos permitira devolver un false o true dependiendo si estas Logado*/

public class Autenticar {
	private boolean isAuth=false;
	//EL obejeto se creara sin Auntenticar 
	public Autenticar() {
		
	}
	//este metodo nos devuelve el estado en el que esta el objeto(true o false)
	public boolean estaLogado(){
		return this.isAuth;
		
	}
	//Este metodo modifica el objeto y devuelve true=Logeado
	public boolean comprobarUser(){
		this.isAuth=true;
		return this.isAuth;
	}	
}
