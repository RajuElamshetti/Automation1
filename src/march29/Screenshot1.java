package march29;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//java time
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_DD  hh_mm_ss");
		String datef = df.format(date);
		//takes screenshot store
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy file to system
		FileUtils.copyFile(screen, new File("D://ScreenShot/"+datef+"_"+"Homepage.png"));
		driver.close();


	}

}