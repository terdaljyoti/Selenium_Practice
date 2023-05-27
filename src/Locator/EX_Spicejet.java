package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_Spicejet
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
	//=============================================================================================================
		
		//driver.findElement(By.xpath("(//div[contains(@class,'r-1awozwy')])[14]")).click();
		//driver.findElement(By.xpath("(//div[@dir='auto'])[57]")).click();
		//driver.manage().window().maximize();
		
    //=============================================================================================================
		
		//driver.findElement(By.xpath("//div[text()='check-in']")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("dhgkjdg");
		//driver.findElement(By.xpath("(//input[contains(@class,'1cwyjr8 ')])[2]")).sendKeys("hdgrhdv");
		//driver.findElement(By.xpath("(//div[contains(@class,'1awozwy ')])[20]")).click();
		
    //=========================================================================================================
		
		driver.findElement(By.xpath("//div[contains(text(),'manage ')]")).click();
		driver.findElement(By.xpath("(//input[@dir='auto'])[1]")).sendKeys("ejgjhhjv");
		driver.findElement(By.xpath("//input[contains(@placeholder,'doe@spicejet')]")).sendKeys("cbnvxnb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'1dbjc4n r-1awozwy')])[20]")).click();

		
   //===============================================================================================
		
		
		
	}

}
