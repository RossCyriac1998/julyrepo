package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webhtml {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/rossc/Desktop/webpage.html");
}
@Test
public void webpage()
{
	driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
	Alert a=driver.switchTo().alert();
	String text=a.getText();
	System.out.println("alert text="+text);
	a.accept();
	//a.dismiss(); //to cancel the alert box
	
	//relative
	driver.findElement(By.name("firstname")).sendKeys("ross");
	driver.findElement(By.name("lastname")).sendKeys("cyriac");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    
    //absolute(short)
   /* driver.findElement(By.xpath("/html/body/input[1]")).click();
    Alert a=driver.switchTo().alert();
	String text=a.getText();
	System.out.println("alert text="+text);
	a.accept();
    driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ross");
    driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("cyriac");
    driver.findElement(By.xpath("/html/body/input[4]")).click();*/
 
	
}
}
