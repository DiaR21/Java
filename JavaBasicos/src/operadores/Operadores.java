package operadores;

public class Operadores {
	public static void main(String[] args) {
		//OPeradores Aritmeticos
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		//suma
		String str1="El resultado de la suma es: ";
		System.out.println(str1+c);
		//resta
		System.out.println("El resultado de la resta es: "+(b-a));
		//divisicion
		int div=a+b;
		System.out.println("El resultado de la division es: "+div);
		double div2=(double)a/b;
		System.out.println("El resultado de la devision es: "+div2);		
		//multiplicacion
		double c1=10.5;
		double mult=c1*a;
		System.out.println("El resultado de la multipliacion es: "+mult);
		//modulo
		int modulo=a/b;
		System.out.println("El resultado de modulo es: "+modulo);
		
		//Operadores de Asignacion
		int d,e; //inicializa la variable vacia
		int f=0, g=5;
		System.out.println(f);
		
		//Operadores Relacionales
		int h=15,i=25;
		String j="Hola";
		System.out.println(h>i);
		System.out.println(i!=h);
		
		//Operador Unitario
		int k=0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Precedencia de operadores
		int op1=(4+5)*6/3;
		System.out.println(op1);
		int x=0, y=0;
		int op2=++x + y--;
		System.out.println(op2);
		
		//Operador Ternario
		int edad=18, valor1=0, valor2=1;
		int valor=(edad<=18)?2:1;		
		//int resultado=(edad<=18)? valor1:valor2;
		
		//Operadores logicos
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		//System.out.println(true!!false);//true
		System.out.println(true&&!false);//true

	}
}
