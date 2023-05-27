package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Index_EX_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("dfbgjhe");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("7365676");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("759847367");
		driver.close();
	}

}
