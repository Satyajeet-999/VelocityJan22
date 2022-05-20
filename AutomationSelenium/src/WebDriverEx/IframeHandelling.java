package WebDriverEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandelling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//driver.switchTo().frame("iframeResult");
		
		WebElement iframeelement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframeelement);
		
	    WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		clickme.click();
		
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		WebElement changetheme = driver.findElement(By.xpath("//a[@title='Change Theme']"));
		changetheme.click();
		
	}

}
