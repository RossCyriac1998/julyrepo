package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcountfb {
ChromeDriver driver;
@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
@Test
public void fblogin()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("No of links="+li.size());
	for(WebElement link:li) 
	{
		String linkText=link.getText();
		String linkUrl=link.getAttribute("href");
		System.out.println("link text="+linkText+"|Link Url"+linkUrl);
		
	}
}
}
