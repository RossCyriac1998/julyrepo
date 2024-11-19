package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng2 {
	ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test(groups= {"sanity"})
public void test1()
{
	if(driver.getPageSource().contains("Create a Rediffmail account"))
	{
		System.out.println("Text is present");
	}
	else
	{
		System.out.println("Text is not present");
	}
}
@Test(groups={"smoke","regression"})
public void test2()
{
	 WebElement rediflogo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	   boolean l=rediflogo.isDisplayed();
	   if(l)
	   {
		   System.out.println("Logo is present");
	   }
	   else
	   {
		   System.out.println("Logo is not present");
	   }
}
@Test(groups={"sanity"})
public void test3()
{
	WebElement redifradio=driver.findElement(By.xpath("//input[2][contains(@name,'gender')]"));
	   boolean l=redifradio.isSelected();
	   if(l)
	   {
		   System.out.println("Radio button is selected");
	   }
	   else
	   {
		   System.out.println("Radio button is not selected");
	   }
}
@Test(groups= {"regression"})
public void test4()
{
	 String buttontxt=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	 System.out.println(buttontxt);
	 if(buttontxt.equals("Check availability"))
	 {
		 System.out.println("Pass");
	 }
	 else
	 {
		 System.out.println("Fail"); 
	 }
}
}
