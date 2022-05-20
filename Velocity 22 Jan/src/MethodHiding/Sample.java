package MethodHiding;

public class Sample {

	public static void main(String[] args) {
		
		// object Creations.
		demo d =new demo();
		demo1 d1= new  demo1();
		// upcasting object.
		demo d11 = new demo1();
		
		
		// non static methods => upcasting  approach ==> child classes methods.
		// calling non static methods
		d.m1();    // parent class.
		d1.m1();    // child class.
		// casting approach (object casting)
		d11.m1();       // child class/
		
		// static Methods
		System.out.println("=================================================================================");
		d.m2();      // parent class/
		d1.m2();     // child class
		d11.m2();    // child XXXXXXXXXXXXXX  parent. method hiding
	}
}
