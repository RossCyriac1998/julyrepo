package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcepage1 {
	static String baseurl="https://www.linkedin.com";
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
			driver.get(baseurl);
			String src=driver.getPageSource();
			if(src.contains("Home"))
			{
				System.out.println("Present");
			}
			else
			{
				System.out.println("Not Present");
			}
			
			
			String actualtitle=driver.getTitle();
			String expectedtitle="Gmail";
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


