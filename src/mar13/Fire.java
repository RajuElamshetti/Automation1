package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver a= new FirefoxDriver();
		a.manage().window().maximize();
		a.manage().deleteAllCookies();
		a.get("https://www.youtube.com/watch?v=ZqFCn4Nia4o");

	}

}
