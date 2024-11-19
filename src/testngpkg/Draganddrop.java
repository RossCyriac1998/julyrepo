package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(bank, account);
		act.perform();
		
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amt1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(amt, amt1);
		act.perform();
		
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement account1=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(sales, account1);
		act.perform();
		
		WebElement amt3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amt4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(amt3, amt4);
		act.perform();
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if (button.isDisplayed())
		{
            System.out.println("The button is displayed.");
        } 
		else 
		{
            System.out.println("The button is not displayed.");
        }
	}
}
