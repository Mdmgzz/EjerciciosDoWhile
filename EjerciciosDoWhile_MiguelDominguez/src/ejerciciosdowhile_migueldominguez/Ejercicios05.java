package ejerciciosdowhile_migueldominguez;

import java.util.Scanner;

public class Ejercicios05 {

	public static void main(String[] args) {
		// bloque de variables
		int numero;					// el numero que introduzca el usuario
		int intento; 				// numeros que íra probando el programa adivinarlo 
		
		// creamos el scanner 
		Scanner sc=new Scanner(System.in);
		// preguntamos al usuario por el numero
		System.out.println("Introduzca un numero entre 1 y 100: ");
		numero=sc.nextInt();											// guarda el numeron introducido
		if (numero>100 || numero<1) {									// comprueba que el numero este entre 1 y 100
			System.out.println("Numero erroneo");
			
		}
		do {															// genera un numero ramdom entre 1 y 100
			intento = (int)(Math.random()*100+1);
			System.out.println(intento);								// muestra el numero generado
			if (intento>numero) {
				System.out.println("El numero secreto es mas pequeño");	// si el generado es mas grande aparecera este mensaje
			}else if (intento<numero) {
				System.out.println("El numero secreto es mas grande");	// si el generado es mas pequelo aparecera este mensaje
			}
		}while (intento!=numero);										// si el generado es igual al introducido, se saldra del bucle
		System.out.println("CORRECTO!!");	
		
		// cerramos el scanner
		sc.close();
	}
	
}
