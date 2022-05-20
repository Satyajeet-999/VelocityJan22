package MethodsObjects;
//Program-1 Static keyword
public class StaticKeyWords {
	int empid;
	String name;
	static int dept;
	
	public void display() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(dept);
	}
	
	public static void main(String[] args) {
		
		StaticKeyWords sk1= new StaticKeyWords();
		sk1.empid=101;
		sk1.name="ABC";
		dept=100;
		sk1.display();
		
		System.out.println("=======================================================================");
		
		StaticKeyWords sk2= new StaticKeyWords();
		sk2.empid=102;
		sk2.name="PQR";
		sk2.display();	
		
	}
	
	
	
	
}
