package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1_XpathByAttribute_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("// input[@name='pass']")).sendKeys("123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 
	}

}
