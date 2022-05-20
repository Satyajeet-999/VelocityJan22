package MethodsObjects;

public class SampleMain {
	public static void main(String[] args) {
		Sample.m1();
		Sample.m2();
	// Nonstatic methods.
	
		Sample sam= new Sample();
		
		sam.m3();
		sam.m4();
		
		// static methods.
		Sample.m1();
		Sample.m2();
		
		Sample sam2= new Sample();
		
		sam2.m3();
		sam2.m4();
	}
}



