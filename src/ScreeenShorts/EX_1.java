package ScreeenShorts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX_1
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("G:\\Velocity Testing\\ScreenShot\\lnm.jpg");
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https:\\www.facebook.com");
		File src_1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest_1=new File("G:\\Velocity Testing\\ScreenShot\\pqr.jpg");
		FileHandler.copy(src_1, dest_1);
		
	}

}
