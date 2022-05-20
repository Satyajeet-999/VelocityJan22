package Generalization;

public class CompanyMain {
public static void main(String[] args) {
		
		idea i = new idea();
		i.calling();
		i.sms();
		i.internet();
		System.out.println("----------------------------------------------------------");
		jio j = new jio();
		j.amazonPrime();
		j.sms();
		j.calling();
		j.internet();
		System.out.println("----------------------------------------------------------");
		Airtel a= new Airtel();
		a.calling();
		a.sms();
		a.internet();
	}
}
