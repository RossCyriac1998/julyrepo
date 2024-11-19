package junitpkg;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class rediffdropdown{
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
	@Test
	public void test1()
	{
		   WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		   Select ob=new Select(day);
		   ob.selectByValue("02");
		   WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		   Select ob1=new Select(month);
		   ob1.selectByValue("02");
		   WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		   Select ob2=new Select(year);
		   ob2.selectByValue("2018");	  
		   
		   
		   WebElement country=driver.findElement(By.xpath("//div[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
		   Select ob3=new Select(country);
		   ob3.selectByValue("Cochin");
		 //div[@id='div_city']/table/tbody/tr[1]/td[3]/select
	}
	@Test
	public void test2()
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
