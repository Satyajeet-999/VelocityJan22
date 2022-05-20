package WebDriverEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDropdown {


	public static void main(String[] args) throws InterruptedException {

		// how to handle the listbox.
		// how to identfy the listbox.  ==> select tag  ==> by using select class in java.
		// driver initialization.
		
		System.setProperty("webdriver.chrome.driver", "D:\\ATOMATION JARS\\chromedriver_win32\\chromedriver100.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Signup.click();
		Thread.sleep(2000);
		// identify the listbox which needs to be handled.
		// WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		// create the object of select class and pass  the respective element
	//	Select s = new Select(birthday);
		
		// To  handle the values use any method.
		// s.selectByIndex(index);   //0==> n-1
		//s.selectByValue(arg0);     // string
		//s.selectByVisibleText(arg0);  // string
		
		//s.selectByIndex(18);
		//s.selectByValue("19");
		//s.selectByVisibleText("19");
		// get all the elements available in dropdown menu.
		
		WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s = new Select(birthyear);
		List<WebElement> years = s.getOptions();
		System.out.println("Total Years in the list "+ years.size());
		
	//	for (int i=0;i< years.size();i++) {
	//		String year = years.get(i).getText();
	//	System.out.println(i+" "+year);
//		}
	
		// advanced for loop.
		int j=1;
	for(WebElement year:years) {
		System.out.println(j+" "+year.getText());
		j++;
	}
//		
		
//		// check the default option.
//		WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		Select s = new Select(birthyear);
		String firstopt = s.getFirstSelectedOption().getText();
	System.out.println(firstopt);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
