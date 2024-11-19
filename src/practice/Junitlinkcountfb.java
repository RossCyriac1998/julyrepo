package practice;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitlinkcountfb {
	ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
@Test
public void test()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("Number of links="+li.size());
}
@After
public void quit()
{
	driver.quit();
}
}
