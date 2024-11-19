package practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitkeralaproperty {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keralalogin()
	{
		driver.findElement(By.id("ulogin")).sendKeys("ross");
		driver.findElement(By.id("upass")).sendKeys("123456");
		driver.findElement(By.id("sub_logbtn")).click();
	}
	@After
	public void quit()
	{
		driver.quit();
	}
}
