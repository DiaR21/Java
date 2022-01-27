
public class ConversionDatos {
	public static void main(String[] args) {
		byte numByte=10;
		short numShort=numByte;
		int numInt=numShort;
		long numLong=numInt;
		int otroInt=(int)numLong;
		short otroShort=(short)otroInt;
		short num1=123;
		short num2=7343;
		byte num3=12;
		byte num4=33;
		
		int suma=(short)(num1+num2);
		byte suma2=(byte)(num3+num4);
		int suma3=(num3+num4);
		short suma4= (short) (num1+num3);
		
	}

}
