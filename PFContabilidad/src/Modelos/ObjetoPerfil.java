package Modelos;

public class ObjetoPerfil {
	//Definimos nuestro atributos
		private String Usuarios="";
		private  String Nombre=" ";
		private  String Apellidos=" ";
		private  String Direccion="";
		private  String Email="";
		private  String NIF="";
		private  String Edad="";
		
	
	
	public ObjetoPerfil(String Usuarios,String Nombre,String Apellidos,String Direccion,String Email,String NIF,String Edad) {
		this.Usuarios=Usuarios;
		this.Nombre=Nombre;
		this.Apellidos=Apellidos;
		this.Direccion=Direccion;
		this.Email=Email;
		this.NIF=NIF;
		this.Edad=Edad;
	}
	public String getUsuarios(){
		return this.Usuarios;
		}
	public String getNombre(){
	return this.Nombre;
	}
	public String getApellidos(){
		return this.Apellidos;
	}
	public String getDireccion(){
		return this.Direccion;
	}
	public String getEmail(){
		return this.Email;
	}
	public String getNIF(){
		return this.NIF;
	}
	public String getEdad(){
		return this.Edad;
	}
}
