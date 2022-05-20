package KeywordsTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSize {
	
	@Test (invocationCount = 2, threadPoolSize = 2)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}
}
