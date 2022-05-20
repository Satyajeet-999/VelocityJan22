package MethodsObjects;

public class Demo {


	// Methods to call from same classs.
	// 2 static methods 2 nonstatic 
	// call them.
	
	
	public static void test1() {
		System.out.println("This is Method one - static");
	}
	
	public static void test2() {
		System.out.println("This is Method Two- static");
	}
	
	public void test3() {
		System.out.println("This is Method Three- Nonstatic");
	}
	
	public void test4() {
		System.out.println("This is Method four- Nonstatic");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method starts");
		
		// static method calling.
		Demo.test1();
		Demo.test2();
		
		// Non static method calling
		
		Demo d1= new Demo();  // declaration of an object
		d1.test3();
		d1.test4();
		
		Demo.test1();
		Demo.test1();
		Demo.test1();
		System.out.println("Main Method Ends");
		
	}

}
