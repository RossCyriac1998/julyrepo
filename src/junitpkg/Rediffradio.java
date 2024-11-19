package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradio {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
	@Test
	public void test()
	{
		WebElement redifradio=driver.findElement(By.xpath("//input[2][contains(@name,'gender')]"));
		   boolean l=redifradio.isSelected();
		   if(l)
		   {
			   System.out.println("Radio button is selected");
		   }
		   else
		   {
			   System.out.println("Radio button is not selected");
		   }
	}
}
//*[contains(@name,'city')]