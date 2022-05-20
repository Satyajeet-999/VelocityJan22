package WebDriverEx;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralScreenshot {
	public static void main(String[] args) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ACER\\Desktop\\Software Testing\\facebook.png");
		//FileUtils.copyFile(src, dest);
		FileUtils.copyDirectory(src, dest);
	}

}
