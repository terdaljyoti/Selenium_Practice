package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();

		System.out.println(text);
		
		alt.accept();
	//	alt.accept();
		
		alt.dismiss();
	}

}
