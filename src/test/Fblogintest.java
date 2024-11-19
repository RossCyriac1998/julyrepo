package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Designpatternfbloginpage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void testlogin()
{
	Designpatternfbloginpage obj=new Designpatternfbloginpage(driver);
	obj.setvalues("ross@gmail.com", "bhhaa");
	obj.login();
	
}

}
