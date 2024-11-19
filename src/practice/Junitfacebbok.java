package practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitfacebbok {
	ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void login()
{
driver.findElement(By.id("email")).sendKeys("ross@gmail.com");	
driver.findElement(By.id("pass")).sendKeys("ross");	
driver.findElement(By.name("login")).click();
}
}
