package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_getTitle
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	    String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
	    String title1=driver.getTitle();
	    System.out.println(title1);
		
	}

}
