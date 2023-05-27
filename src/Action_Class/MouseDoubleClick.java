package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions act=new Actions(driver);
	
		
		//------------Method 1----------------------
//		act.moveToElement(btn).perform();
//		act.doubleClick().perform();

//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		//-------------Method 2----------------------
/*		act.moveToElement(btn).doubleClick().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
*/		
		//------------Method 3------------------------
		act.doubleClick(btn).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
