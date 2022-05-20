package OverloadingRidding;

public class Methodoverriding {
public static void main(String[] args) {
		
		SBI s = new SBI();
		System.out.println(s.rateofintrest());
		System.out.println(s.personalloanintrest());
		
		HDFC h = new HDFC();
		System.out.println(h.rateofintrest());
		
	}
}
