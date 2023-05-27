package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_SelectableListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(day);
		
		boolean result = s1.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("ListBox is MultiSelectable");
		}
		
		else
		{
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByValue("3");
		Thread.sleep(2000);
		s1.selectByVisibleText("5");
		Thread.sleep(2000);
		}
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(month);
		s2.selectByIndex(1);
		Thread.sleep(4000);
		s2.selectByValue("3");
		Thread.sleep(4000);
		s2.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByIndex(8);
		
		
	}
	

}
