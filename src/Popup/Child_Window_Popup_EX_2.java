package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_Popup_EX_2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> allwindowID = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(allwindowID);
		driver.switchTo().window(ar.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> AllWindowsIDSet = driver.getWindowHandles();
		ArrayList<String> arl=new ArrayList<String>(AllWindowsIDSet);
	
		driver.switchTo().window(arl.get(2));
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	//	driver.quit();

		
		

		
	}

}
