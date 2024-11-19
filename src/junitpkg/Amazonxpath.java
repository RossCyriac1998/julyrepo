package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpath {
ChromeDriver driver;
@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();// to maximise inspect screen
	}
@Test
public void perform()
{
	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
	
	driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
	
	driver.navigate().back();  //to move to back page
	driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();

	//hamburger
	driver.findElement(By.xpath("//div[@id='nav-main']/div/a[1]")).click();
	//driver.findElement(By.xpath("//div[@id='nav-main']/div/a/i")).click();
	
	//driver.findElement(By.xpath("//ul[@data-menu-id='1']/li[10]/a")).click();

}
}
