

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
		
	
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver a= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
	}

}
