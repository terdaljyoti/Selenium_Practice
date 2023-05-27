package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_XpathByContainsWithText
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//create new account
		//driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		//forottten password
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
		
	}

}
