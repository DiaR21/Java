package EstructuraDeDatos;

import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
	//pedir 3 numeros y mostrat un mensaje con el numero mayor
		
		System.out.println("Introducir numero 1: ");
		Scanner sr1=new Scanner(System.in);
		int n1=sr1.nextInt();
		System.out.println("Introducir numero 2: ");
		Scanner sr2=new Scanner(System.in);
		int n2=sr2.nextInt();
		System.out.println("Introducir numero 3: ");
		Scanner sr3=new Scanner(System.in);
		int n3=sr3.nextInt();
		
		
		if(n1>n2 && n1>n3 && n2!=n3) {
			System.out.println("el numero mayor es: "+n1);
		}
		if(n2>n1 && n2>n3 && n1!=n3) {
			System.out.println("el numero mayor es: "+n2);
		}
		if(n3>n1 && n3>n2 && n1!=n2) {
			System.out.println("el numero mayor es: "+n3);
		}
		if(n3==n1 && n3==n2) {
			System.out.println("Los numeros son iguales "+n3);
		}
		if(n3==n1 && n3!=n2) {
			System.out.println("Dos son iguales "+n3);
			if(n3>n2) {
				System.out.println("El numero mayor es:  "+n3);
			}else {
				System.out.println("El numero mayor es: "+n2);
			}	
		}
		if(n3==n2 && n3!=n1) {
			System.out.println("Dos son iguales "+n3);
			if(n3>n1) {
				System.out.println("El numero mayor es:  "+n3);
			}else {
				System.out.println("El numero mayor es: "+n1);
			}	
		}
		if(n1==n2 && n1!=n3) {
			System.out.println("Dos son iguales "+n1);
			if(n1>n3) {
				System.out.println("El numero mayor es:  "+n1);
			}else {
				System.out.println("El numero mayor es: "+n3);
			}	
		}
		
		
		

		}

		
	}
