import java.util.Scanner;

public class Angulo {
	public static void main(String[] args) {
	//Triangulo Valido
		
		System.out.println("Introducir angulo 1: ");
		Scanner sr1=new Scanner(System.in);
		int a1=sr1.nextInt();
		System.out.println("Introducir angulo 2: ");
		Scanner sr2=new Scanner(System.in);
		int a2=sr2.nextInt();
		System.out.println("Introducir angulo 3: ");
		Scanner sr3=new Scanner(System.in);
		int a3=sr3.nextInt();
		int t=180;
		if(t==(a1+a2+a3)) {
			System.out.println("Triangulo valido ");
		}else {
			System.out.println("Triangulo no valido ");
		}
		
		
		
	}
	
	
}
