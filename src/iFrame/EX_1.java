package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time.')]")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}

}
