package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
	    String url=	driver.getCurrentUrl();
	    System.out.println(url);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.manage().window().minimize();
	    Thread.sleep(2000);
	    driver.close();
		
	}

}
