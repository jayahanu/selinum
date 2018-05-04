package selinumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage1 extends BasePage 
{

	public static void main(String[] args) throws Exception 
	{
		
		browserLaunch(getData("browser"),getData("eenaduurl"));
		//WebElement loc = driver.findElement(By.id("reg_name"));
		
		//loc.sendKeys("jaya");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.name("reg_name")).clear();
		
	//	driver.findElement(By.className(".//*[@id='reg_name']]")).sendKeys("hanu");
		driver.findElement(By.xpath("//input[@class='form-control_main dfocus']")).sendKeys("jaya");
		

	}

	

}
