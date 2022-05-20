package TestAnotationExamples;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnotationExample {
	@BeforeMethod
	public void login(){
		System.out.println("******* Login *******");
		Reporter.log("******* Login *******");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("******* Logout *******");
		Reporter.log("******* Logout *******");
	}
	
	@Test (priority=1)
	public void HomeElement(){
		System.out.println("Checking the HomePage Url");
		Reporter.log("Checking the HomePage Url");
	}
	
	@Test(priority=2)
	public void ProfileCheck() {
		System.out.println("Checking the ProfilePage Url");
		Reporter.log("Checking the ProfilePage Url");
	}
	
	@Test(priority=3)
	public void NotificationCheck() {
		System.out.println("Checking the NotificationPage Url");
		Reporter.log("Checking the NotificationPage Url");
	}
}
