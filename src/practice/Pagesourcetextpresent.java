package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcetextpresent {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String text=driver.getPageSource();
		if(text.contains("in"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
		driver.quit();
	}

}
