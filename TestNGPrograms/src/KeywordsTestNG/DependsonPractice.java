package KeywordsTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsonPractice {
	@BeforeClass
	public void OpenUrl() {
		System.out.println("Url is opened.");
		Assert.assertTrue(true);
	}
	
	
	@Test (priority = 1)
	public void Test1() {
		System.out.println("Test1 Successful");
	}
	
	@Test (priority = 2, dependsOnMethods = "Test1")
	public void Test2() {
		System.out.println("Test2 Successful");
	}
	
	@Test (priority = 3, dependsOnMethods = {"Test1","Test2"})
	public void Test3() {
		System.out.println("Test2 Successful");
	}
	
	@AfterClass 
	public void Logout() {
		System.out.println("Logout Successful");
	}
}
