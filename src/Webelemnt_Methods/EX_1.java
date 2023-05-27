package Webelemnt_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jhgfj");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='email']")).clear();
	    Thread.sleep(1000);
//-----------------------------------------------------------------------------------------------	    
	   WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	   pass.sendKeys("dkjhgk");
	   Thread.sleep(2000);
	   pass.clear();
	   Thread.sleep(2000);
	   pass.sendKeys("12345");
//------------------------------------------------------------------------------------------------		
	 
	 //  driver.findElement(By.xpath("//button[@name='login']")).click();
	   
	  boolean result= driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).isEnabled();
	   System.out.println(result);
	   if( result)
	   {
		   System.out.println("element is enable");
	   }
	   else
	   {
		   System.out.println("element is disable");
	   }
	}

}
