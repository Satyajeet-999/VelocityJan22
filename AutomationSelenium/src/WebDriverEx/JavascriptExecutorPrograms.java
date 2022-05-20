package WebDriverEx;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPrograms {
    public static void main(String[] args) throws IOException  {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	// 1. Drawing the border around the element.
	
//	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.switchTo().frame("iframeResult");
//	WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("arguments[0].style.border='3px solid red'", TryitBtn);
//	SeleniumUtils.borderbyJS(driver, TryitBtn);
//	SeleniumUtils.getscreenshot(driver);
	
	// Title of the page ==> 
	//driver.getTitle() ==> internal logic mehtod with return type ==> string
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	String titlebyjs = js.executeScript("return document.title;").toString();
	System.out.println(titlebyjs);
	System.out.println(SeleniumUtils.titlebyJS(driver));
	
	// click on the element.
	// element.click()
	
//	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.switchTo().frame("iframeResult");
//	WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("arguments[0].click();", TryitBtn);
//	SeleniumUtils.clickbyjs(driver, TryitBtn);
	
	
	// create the alert ==> to crate the button XX
//	driver.get("https://www.facebook.com/");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("alert('" + "The facebook Site is launched" + "')");
//	SeleniumUtils.alertbyjs(driver, "Facebook page is launched");
	
	// Refreshing the page
	
//	driver.get("https://www.facebook.com/");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("history.go(0)");
//	SeleniumUtils.refreshbyjs(driver);
//	SeleniumUtils.alertbyjs(driver, "The page is sucessfully refreshed");
	
	// Scrolling ==> scrollup/scrolldown/scrollintoview
	
	// scroll down (index px ==> x,y)  (0,1000)
//	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("scroll(0,1000)");
//	SeleniumUtils.scrollupbyjs(driver, 0, 1000);
	
	
	// sroll up ==> scroll down
//	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("scroll(0,2000)");
//	Thread.sleep(2000);
//	js.executeScript("scroll(0,500)");
//	SeleniumUtils.scrolldownbyjs(driver, 0, 2000);
//	SeleniumUtils.scrollupbyjs(driver, 0, 500);
	
	
	// scroll into view. [target the element ==> to scroll upto the element adress]  // at any loction ==> start/mid/end
//	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement DisclaimerBtn = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("arguments[0].scrollIntoView(true);", DisclaimerBtn);
//	DisclaimerBtn.click();
//	SeleniumUtils.scrollIntoView(driver, DisclaimerBtn);
//	SeleniumUtils.clickbyjs(driver, DisclaimerBtn);
//	
	
}
	
	
}
