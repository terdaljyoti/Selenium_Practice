package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_Locator_Amazon
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?i=merchant-items&me=A2278M982WV2RE");
		driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[4]")).click();
		
	}

}
