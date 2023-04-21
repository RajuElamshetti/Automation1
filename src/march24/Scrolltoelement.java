package march24;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltoelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location = 'https://www.amazon.in/'");
		Thread.sleep(5000);
		//store about us
		//WebElement element = driver.findElement(By.linkText("About Us"));
		//js.executeScript("document.scrollIntoview",element);
		//element.click();
		//Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.linkText("Amazon Global Selling"));
		js.executeScript("document.scrollIntoview",element1);
		element1.click();
	}
		
}
