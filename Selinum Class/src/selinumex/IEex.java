package selinumex;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEex
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver","E:\\selinum versions\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe" );
	InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("https:\\www.amazon.com");

	}

}
