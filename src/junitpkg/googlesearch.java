package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
	public void perform()
	{
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cars");
	driver.findElement(By.xpath("//input[@name='btnK']")).click(); //SHOWS ERROR
	
	//WebElement 
	
    }
}
