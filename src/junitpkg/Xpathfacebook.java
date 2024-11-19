package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfacebook {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void fblogin()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ross@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
}
}
