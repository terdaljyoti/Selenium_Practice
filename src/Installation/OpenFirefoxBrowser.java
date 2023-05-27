package Installation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser
{
	public static void main(String[] args)
	{
	//	FirefoxDriver driver=new FirefoxDriver();
		
		
        ChromeDriver driver=new ChromeDriver();
        

    	driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		driver.close();
		driver.quit();
		
	}

}
