package WebDriverEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
	WebDriver driver = new ChromeDriver();   
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	
}
	
	
	
	
	
	
	
	
	
	
	
}
