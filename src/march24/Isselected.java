package march24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[.='Create new account']")).click();
			Thread.sleep(5000);
	//verify firstname texbox enabled or disabled
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	boolean a = firstname.isEnabled();;;
	System.out.println(a);
	//verify reenter textbox
	WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	boolean b = element.isDisplayed();
	System.out.println(b);
	
	
	
	}

}
