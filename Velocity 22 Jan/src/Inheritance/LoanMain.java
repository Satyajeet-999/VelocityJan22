package Inheritance;

public class LoanMain {
public static void main(String[] args) {
		
		// First Customer ==> Hloan.
		
		HomeLoan hl = new HomeLoan();
		hl.username("ABC PQR XYZ");
		hl.mobileNumber("9876543210");
		hl.address("Mumbai");
		hl.HloanIntrestRate();
		System.out.println("===========================================================");
		PLoan pl = new PLoan();
		pl.username("LMN OPR EDF");
		pl.mobileNumber("7894561230");
		pl.address("Navi Mumbai");
		pl.PloanIntrestRate();
		System.out.println("===========================================================");
		VehicleLoan vl = new VehicleLoan();
		vl.username("ACB EFG HJI");
		vl.mobileNumber("1472583690");
		vl.address("Pune");
		vl.FourWheelerloanIntrestRate();
		
	}
}
