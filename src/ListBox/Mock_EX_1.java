package ListBox;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mock_EX_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement country = driver.findElement(By.xpath("(//p)[1]/select"));
		
		
	/*	Select s1=new Select(country);
		Thread.sleep(2000);
		s1.selectByVisibleText("India");
		Thread.sleep(2000);
		*/
		
		Actions act=new Actions(driver);
		act.click(country).perform();
		for(int i=0;i<=105;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 
	 driver.close();
		
	}

}
