package Action_Class;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'right ')]"));
		Actions act=new Actions(driver);
		
	//	act.moveToElement(btn).perform();
	//	act.contextClick().perform();
	//	Thread.sleep(2000);
		
		
	//	act.moveToElement(btn).contextClick().perform();
		
		act.contextClick(btn).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
