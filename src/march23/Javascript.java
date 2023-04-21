package march23;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.html.FrameWindow;

public class Javascript{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// launch url
		js.executeScript("Window.location = 'https://www.amazon.in'");
		Thread.sleep(5000);
		//print title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url
		String strurl = js.executeScript("return document.url").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		// print domain
		String domain = js.executeScript("return document.ddomain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
	}

}
