package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//to open chrome driver
		driver.get("https://www.google.com");//to launch web application
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
		driver.quit();
	}
}
