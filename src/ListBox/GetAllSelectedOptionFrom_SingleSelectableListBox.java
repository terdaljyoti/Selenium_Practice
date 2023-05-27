package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionFrom_SingleSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample4.html");
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s1=new Select(SelectCountry);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByVisibleText("pakistan");
		Thread.sleep(2000);
		s1.selectByIndex(0);
		
		System.out.println("===========================================================================");
		
		String FirstSelected = s1.getFirstSelectedOption().getText();
		System.out.println(FirstSelected);
		
		System.out.println("===========================================================================");
		
		List<WebElement> SelectedOptions = s1.getAllSelectedOptions();
		System.out.println("Selected Options :"+SelectedOptions.size());
		for(WebElement s:SelectedOptions)
		{
			System.out.println(s.getText());
		}
		System.out.println("============================================================================");
		List<WebElement> AllOptions = s1.getOptions();
		
		System.out.println("Options Available: "+AllOptions.size());
		
		for(WebElement a:AllOptions)
		{
			System.out.println(a.getText());
		}
		
		
		
	}

}
