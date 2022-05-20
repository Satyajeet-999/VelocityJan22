package UpCasting;

public class Test {
	public static void main(String[] args) {
		// father class refrence.
//	Father f = new Father();
	//	f.home();
		//f.money();
	//	f.car();

		System.out.println("******************************************");		
		// child
	son s = new son();
	s.bike();
	s.car();
	s.home();
	s.money();
		
	System.out.println("******************************************");	
//		//upcasting
		Father f= new son();
	f.home();  
	f.car();
	f.money();    
		
		// downcasting.
		
		son s1 =(son) new Father();   //complie error
		s1.home();
		s1.bike();
		s1.money();
		s1.car();
		
	}
}
