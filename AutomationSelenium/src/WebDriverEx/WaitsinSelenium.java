package WebDriverEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsinSelenium {
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  
		// using implicit wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // browser.
		 WebElement CreateNewAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		  CreateNewAccBtn.click();
		  
		  // using explicit wait.
		 WebDriverWait wait = new WebDriverWait(driver,30); // implicit wait==> thisis applicable to all next elements.
		    WebElement singupbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='websubmit']"))); 
		  singupbtn.click();

	}
}
