package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleget {
	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
String actualtitle=driver.getTitle();
String expectedtitle="Ggle";
if(actualtitle.equalsIgnoreCase(expectedtitle))
{
	System.out.println("Title is same");
}
else
{
	System.out.println("Title is not same");
}
	}
}
