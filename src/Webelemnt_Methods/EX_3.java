package Webelemnt_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[text()='Cart']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[contains(@class,'_2T1qz2')]")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7709224811");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[text()='Request OTP']")).click();
		
	
		
		
	}

}
