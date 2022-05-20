package WebDriverEx;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeshotAdvance {
	public static WebDriver driver;
	public static void getscreenshot() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
		File dest = new File("C:\\Users\\ACER\\Desktop\\Software Testing\\facebook_"+filename);
	//	FileUtils.copyFile(src, dest);
		FileUtils.copyFile(source, dest);
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
		driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		getscreenshot();
		
	   Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(5000);
		getscreenshot();
	}

}
