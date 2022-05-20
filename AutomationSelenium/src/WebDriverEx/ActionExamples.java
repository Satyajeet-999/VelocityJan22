package WebDriverEx;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExamples {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
	WebDriver driver = new ChromeDriver();   
	
	// hover the elements.
	driver.get("https://www.next.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
	
	 List<WebElement> links = driver.findElements(By.xpath("//ul[@class='component__Container-sc-3ipjnx-0 cileZz']/li/a"));
	
	 for (int i =0; i<13;i++) {
		 WebElement link = links.get(i);
		 Actions action = new Actions(driver);
		 action.moveToElement(link);
		 action.build().perform();
		 System.out.println(link.getAttribute("data-ga-v2"));
		 Thread.sleep(2000);
	 }
	
	
	// how to handle resizable items
//	driver.get("https://jqueryui.com/resizable/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	driver.switchTo().frame(frame);
//	WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//	Thread.sleep(2000);
//	Actions action = new Actions(driver);
//	action.dragAndDropBy(resizable, 150, 50).build().perform();
	
	
	// drag and drop
	
//	driver.get("https://jqueryui.com/droppable/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	driver.switchTo().frame(frame);
//	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//	WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//	Thread.sleep(2000);
//	Actions action = new Actions(driver);
//	action.dragAndDrop(draggable, droppable).build().perform();
	
	// draggable.
	
//	driver.get("https://jqueryui.com/draggable/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	driver.switchTo().frame(frame);
//	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//	Thread.sleep(2000);
//	Actions action = new Actions(driver);
//	action.dragAndDropBy(draggable, 150, 150).build().perform();
	
	
	
	// right click.
	
//	driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//	Thread.sleep(2000);
//	Actions action = new Actions(driver);
//	action.contextClick(image).build().perform();
	
	
	// sendkeys by using action.

//	driver.get("https://www.facebook.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
//	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//	Actions action = new Actions(driver);
//	//action.sendKeys(username, "Paresh").build().perform();
//	action.keyDown(username,Keys.SHIFT).sendKeys("paresh").keyUp(Keys.SHIFT).build().perform();
//	//action.keyUp(Keys.SHIFT).build().perform();
//	action.sendKeys(password, "Paresh@987654123").build().perform();
//	action.sendKeys(Keys.ENTER).build().perform();



	// click or double click
//	driver.get("https://www.next.co.uk/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
//	WebElement link = driver.findElement(By.xpath("//ul[@class='PrimaryDesktopNavigation']/li[6]"));
//	Actions action = new Actions(driver);
//	Thread.sleep(2000);
//	//action.moveToElement(link).click().build().perform();
//	action.moveToElement(link).doubleClick().build().perform();
//	
//	
	
	driver.close();
}

}
