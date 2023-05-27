package Scroll_Up_Down;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX_2_ScrollIntiView 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement text = driver.findElement(By.xpath("//h2[text()='Must-haves for School']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",text);
		
		Thread.sleep(3000);
		
		WebElement adv = driver.findElement(By.xpath("//span[text()='Advertise']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", adv);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("G:\\Velocity Testing\\ScreenShot\\asd.jpg");
		FileHandler.copy(src, dest);
	
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
	}

}
