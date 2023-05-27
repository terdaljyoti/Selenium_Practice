package Webelemnt_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1_getAttribute 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement un=driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("asdfgjkg");
		String untext = un.getAttribute("value");
		System.out.println(untext);
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345");
		String passtext = pass.getAttribute("value");
		System.out.println(passtext);
		
	}

}
