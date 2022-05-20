package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExamples {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
	
	WebDriver driver = new ChromeDriver();
	
	// to enter the url.
			driver.get("https://www.facebook.com/");
			
			// what is current url.
		//	String url = driver.getCurrentUrl();
		//	System.out.println(url);
			
			// to get the title of the tab.
		//	String expectedtitle="Google";
	//	String actualtitle = driver.getTitle();
	//	System.out.println(actualtitle);
		
		//	if (expectedtitle.equalsIgnoreCase(actualtitle)) {
			//	System.out.println("Testcase is passed");
	//		}else {
		//		System.out.println("Testcase is failed");
			//}
			
			// maximize the browser.
		//	driver.manage().window().maximize();     /// you cannnot minimize of the browser.

			// navigate.
		//	driver.navigate().to("https://www.facebook.com/");
		//	driver.navigate().back();      /// google
		//	driver.navigate().forward();   /// facebook
		//	driver.navigate().refresh();
			
			// you can not minmize but you can set the size. (this is trial and error)
			
		//	Dimension d= new Dimension(100,300);
			//driver.manage().window().setSize(d);
			
			// set the position on screen.(this is trial and error)
		//	Point p	= new Point(500,800);
		//	driver.manage().window().setPosition(p);
			
		//	Thread.sleep(2000);  // This is wait provided in milliseconds to control the script execution speed.
			
			// to close the browser. 
		//	driver.close();
			
			//driver.quit();
			// close command and quit command:- close command==> will close current tab only. quit command will close all the tabs.
		

			WebElement CreateNewAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateNewAccBtn.click();
		Thread.sleep(2000);
		WebElement FemaleOptbtn = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		
		System.out.println("Female option status "+ FemaleOptbtn.isSelected());  // false 
		
		FemaleOptbtn.click();
		
		System.out.println("Female option status "+ FemaleOptbtn.isSelected());   // true





}
	
}


