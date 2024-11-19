package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
}
@Test
public void login()
{
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[1]")).click();
	driver.findElement(By.id("checkout")).click();
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("ross");
	driver.findElement(By.name("firstName")).sendKeys("ross");
	driver.findElement(By.name("lastName")).sendKeys("cyriac");
	driver.findElement(By.name("postalCode")).sendKeys("682021");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
}
}
