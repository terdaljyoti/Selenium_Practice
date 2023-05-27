package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Index_EX_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");


	//	driver.findElement(By.xpath("(//input[contains(@class,'55r1 _6luy')])[1]")).sendKeys("12345");
	//	driver.findElement(By.xpath("(//input[contains(@class,'_55r1 _6luy')])[2]")).sendKeys("12345");
	//	driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
		
		//    =====================================================================================
		
		driver.findElement(By.xpath("//a[contains(text(),'new')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext ')])[3]")).sendKeys("12323");
		driver.findElement(By.xpath("(//input[contains(@class,'5dba _2ph-')])[2]")).sendKeys("abcd");
		driver.findElement(By.xpath("(//input[contains(@class,'_58mg ')])[3]")).sendKeys("4555987675");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("856874668");
	}

}
