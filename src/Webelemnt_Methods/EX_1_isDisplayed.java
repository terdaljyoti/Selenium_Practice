package Webelemnt_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1_isDisplayed
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(result);
		if(result)
		{
			System.out.println("logo is Present");
		}
		
		else
		{
			System.out.println("logo is not Present");
		}
		
	}

}
