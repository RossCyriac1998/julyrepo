package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Designpatternfbloginpage {

	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
//	@FindBy(id="email")
//	WebElement fbemail;
//	@FindBy(name="pass")
//	WebElement fbpassword;
//	@FindBy(name="login")
//	WebElement fblogin;
	
	public Designpatternfbloginpage(WebDriver driver)
	{
		this.driver=driver;
		
		//PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
		
//		fbemail.sendKeys(email);
//		fbpassword.sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
		
		//fblogin.click();
	}
}
