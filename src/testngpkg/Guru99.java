package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1() throws Exception
	{
		WebElement btn1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(btn1);
		act.perform();
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();	
		driver.switchTo().alert().accept();
		
		
		WebElement btn2=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(btn2);
		act.perform();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	
		
}
}