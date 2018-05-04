package selinumex;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireforLaunch 
{

	public static void main(String[] args)
	{	
		System.setProperty("webdriver.gecko.driver","E:\\selinum versions\\geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
	}

}
