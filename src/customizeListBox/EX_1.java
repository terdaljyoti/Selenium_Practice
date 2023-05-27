package customizeListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		driver.manage().window().maximize();
		WebElement status = driver.findElement(By.xpath("//select[@name='States']"));
		
		Actions act=new Actions(driver);
		act.click(status).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.END).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		driver.close();
		
	}

}
