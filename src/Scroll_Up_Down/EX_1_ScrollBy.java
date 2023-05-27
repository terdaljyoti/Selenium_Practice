package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1_ScrollBy 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		 WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",signup);
		 
		 
	}

}
