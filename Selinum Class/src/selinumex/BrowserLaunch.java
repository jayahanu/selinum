package selinumex;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch

{

     public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.setProperty("webdriver.gecho.driver",System.getProperty("user.dir")+"//Drivers//gechodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.navigate().to("https://www.flipkart.com");
		
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//driver//IEDriverServer.exe");
		InternetExplorerDriver driver3=new  InternetExplorerDriver();
		driver3.get("https://www.ebay.com");

	}
}
