package Arreglo;

public class ManipularArreglo {
	public static void main(String[] args) {
	String Cadena = "Frase";
	System.out.println("Cadena de Texto: '" + Cadena + "'");
	System.out.println("Tamaño de la cadena: " + Cadena.length() + " caracteres");
	int numeros[];
	numeros=new int[4];
	numeros[0]=1;
	numeros[1]=2;
	numeros[2]=3;
	numeros[3]=4;
	
//	int[] arr=new int[] {1,2,3};
	int sumaPar=0, sumaInpar=0;
	
	for (int i=0;i<numeros.length; i++) {
		if (numeros[i] % 2==0) {
			System.out.println("\nNumero "+numeros[i]+" es par");
			sumaPar+=numeros[i];
		}else {
			System.out.println("\nNumero "+numeros[i]+" es inpar");
			sumaInpar+=numeros[i];
		}
	}
	System.out.println("\nLa suma de los pares es:  "+sumaPar);
	System.out.println("\nLa suma de los pares es:  "+sumaInpar);
	
	
	}
}	
		

