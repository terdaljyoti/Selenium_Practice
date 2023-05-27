package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1_XpathByAttribute
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7709224811");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jyoti@testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
