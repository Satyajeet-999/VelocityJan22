package Inheritance;

public class Test {
	public static void main(String[] args) {
		//Parent = on Parent refrence you call only parent class methods.
		
		
		Parent p= new Parent();
		p.m1();
		
		System.out.println("============");
		
		Child c= new Child();
		c.m1();
		c.m2();
		
		System.out.println("=========================");
		
		GrandSon g= new GrandSon();
		g.m1();
		g.m2();
		g.m3();
		
		
	}
}
