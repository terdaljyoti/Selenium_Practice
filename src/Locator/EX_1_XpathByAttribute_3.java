package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1_XpathByAttribute_3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7709224811");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jyoti@testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
