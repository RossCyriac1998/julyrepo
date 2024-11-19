package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws InterruptedException, IOException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");  
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\rossc\\Documents\\Fileuploadautoit.exe");
		Thread.sleep(3000);
		
	}
}
