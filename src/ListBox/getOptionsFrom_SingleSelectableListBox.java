package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsFrom_SingleSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
				
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		List<WebElement> Alloptions= s1.getOptions();
		
		for(WebElement a1:Alloptions)
		{
		System.out.println(a1.getText());	
		}
		
		
		
	}

}
