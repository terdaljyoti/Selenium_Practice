package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_XpathByContainsWithAttribute
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("12345");
		//driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
		

		driver.findElement(By.xpath("//a[contains(@class,'selected ')]")).click();
		
		
	}

}
