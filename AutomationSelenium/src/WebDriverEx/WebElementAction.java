package WebDriverEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAction {
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	//how to perform actions on webelements
	//1. sendkeys()==> this method used to pass the data in the text field
	//WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	//username.sendKeys("Satyajeet");
	
	
//	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	
//	password.sendKeys("satyajeet999");
	
	//2. Click==>To click on the buttons/radio button or checkbox==Left click
	
	//WebElement CreateNewAcc= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	//CreateNewAcc.click();
	
	//Thread.sleep(2000);
//WebElement FemaleOptBtn= driver.findElement(By.xpath("//input[@type='radio' and @value='1']"))	;
//FemaleOptBtn.click();
	
//	WebElement MaleOptBtn= driver.findElement(By.xpath("//input[@type='radio' and @value='2']"))	;
  //MaleOptBtn.click();
	
//Thread.sleep(2000);
//WebElement Emailid = driver.findElement(By.xpath("//input[@name='email']"));
//System.out.println(Emailid.isEnabled());  // boolean value. // true //false
	
//if(Emailid.isEnabled()==true) {
//	Emailid.sendKeys("satyajeet@gmail.com");
//}else {
//System.out.println("The element is not intractable");
//}

//WebElement selectpronoun = driver.findElement(By.xpath("//option[text()='Select your pronoun']"));
//System.out.println("selctprnoun status "+selectpronoun.isEnabled() );
	
//4. is dispayed.

//	WebElement Emailid = driver.findElement(By.xpath("// input[@name='email']"));
	//System.out.println("Email id status "+ Emailid.isDisplayed());
//	WebElement Password = driver.findElement(By.xpath("// input[@name='pass']"));
//	System.out.println("Password status "+Password.isDisplayed());	
	
	
//  5. is selected.
	
		WebElement CreateNewAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	CreateNewAccBtn.click();
		Thread.sleep(2000);
	WebElement FemaleOptbtn = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		System.out.println("Female option status "+ FemaleOptbtn.isSelected());  // false 
		FemaleOptbtn.click();
	System.out.println("Female option status "+ FemaleOptbtn.isSelected());   // true
	
	

	// get text() :- to get the text of any element. (for single)
	
	//  String actualtext = driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).getText();
	//  String expectedtext = "Log In";
	 
	// if(actualtext.equals(expectedtext)) {
	//	 System.out.println("Test Case pass for Log In text verification");
	// }else {
	//	 System.out.println("Test Case fail for Log In text verification");
	// }
	 
	// get attribute.
	
//	String attributeid = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("type");
//	System.out.println(attributeid);
		
		
		
		// multiple elements.
		
	//List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"));
	//System.out.println(footerlinks.size());
//		
//		
	//for (int i=0; i<footerlinks.size();i++) {
	//	String footerlink = footerlinks.get(i).getAttribute("href");
	//	  String footertext = footerlinks.get(i).getText();
	//	System.out.println(i+""+footertext+"==> "+footerlink);
	}
		
	
	
	
	
	
	
	
	
	
}

