package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRating 
{
	public static void main(String[] args) throws InterruptedException
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//enter url in browser
		driver.get("https://www.flipkart.com/");
		
		//click on cancel btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//search mobile name
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 12 pro");
		
		//click on search btn
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//get reting
		String reting = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		
		System.out.println(reting);
		Thread.sleep(2000);
	}

}
