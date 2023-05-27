package HandleMultipleElementsAtATime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_DeselectAllCheckBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/MultiPleElement.html");
		
		List<WebElement> AllCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("No of CheckBox : "+AllCheckBox.size());
		
		for(WebElement a:AllCheckBox)
		{
			a.click();
			Thread.sleep(500);
		}
		Thread.sleep(2000);
		
		for(int i=AllCheckBox.size()-1;i>=0;i--)
		{
			AllCheckBox.get(i).click();
		}
		driver.close();
	}
	

}
