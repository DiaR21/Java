package EstructuraDeDatos;

import java.util.Scanner;

public class EstructuraDeDatos {
	public static void main(String[] args) {
	//Escructura de control de frujo
	//nos sirve para la toma de decisiones
	//Estructura de control de flujo nos sirve para
	//Cambiar el flujo de nuestro programa 
	//evaluar una condicion y partir de la evaluacion 
	//se realiza una accion u otra.
	
	System.out.println("Introduce tu edad:");
	Scanner sr=new Scanner(System.in);
	int edad=sr.nextInt();
	if(edad>=18) {
		System.out.println("Eres mayor de edad");
	} else {
		System.out.println("Eres menor de edad");
	}

	
	}
	
}

