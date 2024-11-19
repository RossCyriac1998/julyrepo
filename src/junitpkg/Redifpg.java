/*package junitpkg;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflinkcount {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		int linkcount=li.size();
		if(linkcount==30)
		{
			System.out.println("link count= 30");
		}
		else 
		{
			System.out.println("link count is actually "+linkcount);
		}
	}
	@Test
	public void checktext()
	{
		String etext="Create a rediffmail account";
		String src=driver.getPageSource();
		if(src.contains(etext))
		{	
			System.out.println("contains text");
		}
		else {
			System.out.println("not contains ");
		}
	}

}*/

package junitpkg;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.platform.suite.api.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Redifpg {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
   @Test
    public void check1() {
   	 List<WebElement>li=driver.findElements(By.tagName("a"));
    	 System.out.println("total no of links "+li.size());
//   	 if(li.contains(30)) {
//    	   	 System.out.println("meet the expectation ");
//    	 } 
//    	 else {
//    	   	 System.out.println("doesn't meet the expectation ");
//   	 }
    }
    @Test
    public void check2()
    {
    	//driver.findElement(By.xpath("//a[@title='Create Rediffmail account']")).click();
    	if(driver.getPageSource().contains("Create a Rediffmail account"))
    	{
    		System.out.println("Text is present");
    	}
    	else
    	{
    		System.out.println("Text is not present");
    	}
    }
   @Test
   public void check3()
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
}

