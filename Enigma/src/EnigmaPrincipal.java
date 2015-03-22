
public class EnigmaPrincipal {

			
		public static Cesar cesar;
		static String mnsjEncriptado;
		//INTRODUCIOMOS EL MENSAJE A ENCRIPTAR
		static String mensaje = "Hola gabi"; 

		public static void main(String[] args) {
		
		cesar = new Cesar(); 
		mnsjEncriptado = cesar.Encriptacion(mensaje); 
		System.out.println(mnsjEncriptado); 
			}
		}

	


