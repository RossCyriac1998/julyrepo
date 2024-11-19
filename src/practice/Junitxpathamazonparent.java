package practice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Junitxpathamazonparent {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();  //span[@id='nav-search-submit-text']/input[1]
	    driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();	
	    driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();//div[@class='nav-line-1-container']/span[1]
	    driver.navigate().back();
	    driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();//div[@id='nav-cart-count-container']
	  
}
}
