package Arreglo;

public class Arreglos {
	public static void main(String[] args) {
		int numeros[];
		numeros=new int[4];
		String[] nombres=new String[4];
		String []nombreFrutas=new String[]{"Manzana", "Platano", "Uva", "Pera"};
		numeros[0]=10;
		numeros[1]=8;
		numeros[2]=100;
		numeros[3]=200;
		nombres[0]="Juan";
		nombres[1]="Pedro";
		nombres[2]="Antonio";
		nombres[3]="Felipe";
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros);
		
		for (int i=0;i<numeros.length; i++) {
			System.out.println("\nElemento de numero "+i+" es: "+numeros[i]);
			System.out.println("\nElemento de nombre "+i+" es: "+nombres[i]);
			System.out.println("\nElemento de nombre  de Fruta "+i+" es: "+nombreFrutas[i]);
			
		}
	}
}
