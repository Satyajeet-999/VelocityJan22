package BasicTestNGExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IntroductionToTestNG {
	@Test (priority=1)
	public void openUrl()
	{
		System.out.println("Url is opened");
		Reporter.log("Url is opened");
	}
	
	@Test (priority=2)
	public void login()
	{
		System.out.println("login is sucessfull");
		Reporter.log("login is sucessfull");
	}
	
	@Test (priority=3)
	public void logout()
	{
		System.out.println("logout is sucessfull");
		Reporter.log("logout is sucessfull");
		Reporter.log("All events are completed sucessfully");
	}
}
