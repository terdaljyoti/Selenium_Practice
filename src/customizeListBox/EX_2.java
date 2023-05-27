package customizeListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX_2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
		act.click(month).perform();
		act.sendKeys(Keys.END).perform();
		for(int i=1;i<=7;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
			
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
