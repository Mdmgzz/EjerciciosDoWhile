package ejerciciosdowhile_migueldominguez;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		int numero=1;						// se guardara el registro de los numero para mostrarlos
		
		//abrimos el bucle para empezar a escribir 
		do {
			System.out.println("Número"+numero);		//mostramos el numero por el que va 
			numero++;									// sumamos 1 
			
		} while (numero<21);							// hasta que el valor de numero llegue a 20
	}

}
