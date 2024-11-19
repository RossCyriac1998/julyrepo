package practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitannotationdemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
@Test
public void test()
{
	String actualtitle=driver.getTitle();
	String expectedtitle="Google";
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("Title is same");
	}
	else
	{
		System.out.println("Title is not same");
	}
}
@After
public void close()
{
	driver.quit();
}
}
