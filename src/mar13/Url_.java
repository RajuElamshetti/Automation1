package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_ {

	public static void main(String[] args) throws Throwable {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("http://yahoo.com");
    Thread.sleep(5000);
    String Expected = driver.getCurrentUrl();
    String Actual = "https://";
    if (Expected.startsWith(Actual))
    {
    	System.out.println("Url is secured::"+Expected+"  "+Actual);
    }
    else
    {
    	System.out.println("Url is not secured::"+Expected+"  "+Actual);
    }
    driver.close();
   

	}

}
