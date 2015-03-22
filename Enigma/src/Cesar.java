
public class Cesar {
//DEFINIMOS VARIABLES
char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
char alfabeto_cod[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
int k = 2; //DESPLAZAMIENTO
char[] msj_cod;

	
public Cesar() {
	//CREAMOS LOS BUCLES PARA LA CODIFICACION DEL ALFABETO
		for (int i=0; i<alfabeto.length; i++) {
			for(int j=k;j<i-k;j++){
				alfabeto_cod[i] = alfabeto[j];
						}
				}
				
			}
			
public String Encriptacion(String mensaje) {
	// VARIABLE DE RETORNO
	String MensajeCodificado;
	//IGUALAMOS LOS CARACTERES A MAYUSCULAS
	mensaje = mensaje.toUpperCase(); 
	//TRANFORMAMOS EL STRANG EN ARRAY
	char[] ArrayMensaje = mensaje.toCharArray();
	//IGUALAMOS MSJ_COD AL ARRAY Y LO MEDIMOS
		msj_cod = new char[ArrayMensaje.length]; 
	//CREAMOS BUCLE PARA ARRAY NUEVO
		for (int i=0; i<ArrayMensaje.length; i++) { 
	//RECORREMOS ALFABETO	
			for (int j=0; j<alfabeto.length; j++) { 
	//PONEMOS LA CONDICION PARA EL CAMBIO		
					if (ArrayMensaje[i] == alfabeto[j]) {
						msj_cod[i] = alfabeto_cod[j]; 
					} else ;
    }
}
	//CAMBIAMOS EL ARRAY RESULTANTE A UN STRING
		MensajeCodificado = new String(msj_cod);
		
return MensajeCodificado; 
	}
}