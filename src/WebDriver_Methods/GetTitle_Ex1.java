package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Ex1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
