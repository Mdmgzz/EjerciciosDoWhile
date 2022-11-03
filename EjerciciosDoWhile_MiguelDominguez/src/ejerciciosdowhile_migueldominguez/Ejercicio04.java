package ejerciciosdowhile_migueldominguez;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//bloque de variables
		int numero; 			// se guardara el numero que introduzca el usuario
		int conteo=1;				// se ira contando de 1 en 1 desde el 1 hasta el numero introducido
				
		// creamos el Scanner 
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un numero: ");
		numero=sc.nextInt();
				
		//abrimos el bucle 
				
		do {
			System.out.println(numero+"*"+conteo+"="+numero*conteo);
			conteo++;
		}while (conteo<=10);
	
		//cerramos el scanner
		sc.close();
	}

}
