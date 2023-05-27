package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1_XpathByAttribute_2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("asdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
