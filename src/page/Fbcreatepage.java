package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbcreatepage;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a") 
	WebElement sighup;
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void check()
	{
		fbcreatepage.click();
		
		String src=driver.getPageSource();
		if(src.contains("Create a Page"))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("does not contains");
		}
		
		sighup.click();
		
	}
}

