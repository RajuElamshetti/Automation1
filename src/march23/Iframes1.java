package march23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		List<WebElement>All_frames = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+All_frames.size());
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("droppable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		driver.quit();
		
		
		
}
}