package junitpkg;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
@Before
public void setUp()
{
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
}

@Test
public void titleverification()
{
	String act=driver.getTitle();
	String exp="Google";
	if(act.equals(exp))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}	
}
@After
public void teardown()
{
	driver.quit();
}
}
