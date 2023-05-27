package HandleMultipleElementsAtATime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/MultiPleTextBox.html");
		driver.manage().window().maximize();
		
		String ar[]= {"java","php","C#",".Net","Angular","NodJS","JAvaScript","c","c++","python"};
		
		List<WebElement> allTextBOX = driver.findElements(By.xpath("//input[@type='text']"));
		
		for(int i=0;i<=allTextBOX.size()-1;i++)
		{
			allTextBOX.get(i).sendKeys(ar[i]);
				
		}

	
		
	}

}
