package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HanddleDropDwn 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement LoginDropDown = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(LoginDropDown).perform();
		driver.findElement(By.xpath("//div[text()='Orders']")).click();
		
		

		
	}

}
