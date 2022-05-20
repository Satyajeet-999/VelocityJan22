package OverloadingRidding;

public class TestMain {
public static void main(String[] args) {
		
		Parent p = new Parent();
		p.property();
		p.Marriage();   
	
		Child c = new Child();
		c.property();
		c.Marriage();
	}
}
