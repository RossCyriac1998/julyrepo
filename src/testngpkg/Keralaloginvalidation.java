package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keralaloginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keralalogin() throws InterruptedException
	{
		driver.findElement(By.id("ulogin")).sendKeys("ross@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("ross123");
		driver.findElement(By.id("sub_logbtn")).click();
		Thread.sleep(3000);
		String act=driver.getCurrentUrl(); 
		String current="https://keralaproperty.in/member/myhome/";
		if(act.equals(current))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Login failed");
		}
	}
}
