package march21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https:/flipkart.com");

		Thread.sleep(5000);

		Actions ac = new Actions(driver);

		ac.sendKeys(Keys.ESCAPE).perform();

		//mouse to fashions

		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();

		Thread.sleep(5000);

		//mouse to All link and click

		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();

		Thread.sleep(5000);

		//mouse to Electronics

		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();

		Thread.sleep(5000);

		ac.moveToElement(driver.findElement(By.linkText("iPhone SE"))).click().perform();

		Thread.sleep(5000);

		driver.quit();

		}

		 
	}


