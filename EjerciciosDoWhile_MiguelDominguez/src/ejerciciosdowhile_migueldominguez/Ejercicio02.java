package ejerciciosdowhile_migueldominguez;

public class Ejercicio02 {

	public static void main(String[] args) {
		// bloque de variables
	int numero=1;						// se guardara el registro de los numero para mostrarlos
		
		//abrimos el bucle para empezar a escribir 
		numero++;											// sumammos 1 para que empiece en 2
		do {
				System.out.println("Número"+numero);		// vamos sumando 2 al numero para mostrar los pares
				numero = numero + 2;
			
			} while (numero<201);							// hasta llegar a 200

	}
	}


