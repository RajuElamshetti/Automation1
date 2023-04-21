package march29;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	//take screenshot and store
	File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy file to system
	FileUtils.copyFile(screen, new File("D://homepage.png"));
	driver.close();
	}

}
