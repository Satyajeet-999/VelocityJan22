package Casting;

public class PrimitiveCasting {
public static void main(String[] args) {
		
		// Implict:- lower to higher
		// byte==> short ==> int  ==> long==> float==> double.
		int a= 10;
		System.out.println(a);
		double b = a;
		System.out.println(b);
		double db = 10.5;
		System.out.println(db);
		int in = (int) db;
		System.out.println(in);
		double db1 = 10.2569876321593;
		System.out.println(db1);
		float f =(float) db1;
		System.out.println(f);

		// implicit casting
		byte i =50;
		short j =i;
		int k =j;
		long l=k;
		float f1= l;
		double dd= f1;
		System.out.println("The byte value is "+ i);
		System.out.println("The short value is "+ j);
		System.out.println("The int value is "+ k);
		System.out.println("The long value is "+ l);
		System.out.println("The float value is "+ f1);
		System.out.println("The double value is "+ dd);
		
		
		// explicit casting
		// double==>float==>long==> int==>  short==>byte
		
		double d1= 75.5;
		float f2=  (float) d1;
		long ll1= (long) f2;
		int in1= (int) ll1;
		short ss= (short) in1;
		byte bb= (byte) ss;
		
		
		System.out.println("The double value is "+ d1);
		System.out.println("The float value is "+ f2);
		System.out.println("The long value is "+ ll1);
		System.out.println("The int value is "+ in1);
		System.out.println("The short value is "+ ss);
		System.out.println("The byte value is "+ bb);
	}
}
