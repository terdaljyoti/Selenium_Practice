package Webelemnt_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qazwsxed");
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345");
		Thread.sleep(2000);
		pass.clear();
		pass.sendKeys("asdfg");
		String text=driver.findElement(By.xpath("//button[@name='login']")).getText();
		System.out.println(text);
		
		boolean result=driver.findElement(By.xpath("//a[text()='Create new account']")).isEnabled();
		System.out.println(result);
		if(result)
		{
			System.out.println("element is enable");
		}
		else
		{
			System.out.println("element is disable");
		}
		driver.navigate().to("https://www.instagram.com/");
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[contains(@class,'_acas _aj1-')]")).click();
		boolean result1=driver.findElement(By.xpath("//button[contains(@class,'_acas _aj1-')]")).isEnabled();
		//Thread.sleep(3000);
		if(result1)
		{
			System.out.println("element is enable");
		}
		else
		{
			System.out.println("element is disable");
		}
		
	}

}
