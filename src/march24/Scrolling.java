package march24;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location = 'https://www.amazon.in/'");
		Thread.sleep(5000);
		//scroll top to down
		js.executeScript("window.scroll(0,document.body.scrollheight)");
		Thread.sleep(5000);
		//scroll bottom t top
		js.executeScript("window.scrollTo(document.body.scrollheight,0)");
		Thread.sleep(5000);
		//scroll to certain pixel
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		driver.quit();
		}
		
		
		
}
