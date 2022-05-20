package AbstractInterfaces;

public class VehicleMain {

public static void main(String[] args) {
		
		Bus b = new  Bus ();
		System.out.println(b.getNumberofWheels());
		
		Cars c = new  Cars ();
		System.out.println(c.getNumberofWheels());
		
		
		Bikes bk = new  Bikes ();
		System.out.println(bk.getNumberofWheels());
		
	}
}
