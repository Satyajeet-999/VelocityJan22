package MethodsObjects;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1= new Employee();  // object creation of employee class.
		emp1.empid=101;
		emp1.empname="ABC";
		emp1.empSal=22369.70;
		emp1.empdept=05;
		emp1.empjob="Developer";
		emp1.display();
		
		System.out.println("====================================================================");
		
		Employee emp2= new Employee();  // object creation of employee class.
		emp2.empid=102;
		emp2.empname="CDE";
		emp2.empSal=45369.70;
		emp2.empdept=03;
		emp2.empjob="Tester";
		emp2.display();
	}
	}


