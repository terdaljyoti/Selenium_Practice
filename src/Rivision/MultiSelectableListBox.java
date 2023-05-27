package Rivision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample4.html");
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s1=new Select(SelectCountry);
		boolean result = s1.isMultiple();
		System.out.println(result);
		
		System.out.println("----GetAllOptions---");
		
		List<WebElement> AllOptions = s1.getOptions();
		for(WebElement a:AllOptions)
		{
			System.out.println(a.getText());
		}
		
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByVisibleText("Austrolia");
		Thread.sleep(2000);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		
		System.out.println("----GetFirstSelectedOptions---");
		
		String F_S = s1.getFirstSelectedOption().getText();
		System.out.println("first selected option : "+F_S);
		
		System.out.println("----GetAllSelectedOptions---");
		
		List<WebElement> AllSelected = s1.getAllSelectedOptions();
		for(WebElement a:AllSelected)
		{

			System.out.println(a.getText());
		}
		
		/*
		s1.deselectByIndex(1);
		Thread.sleep(2000);
		s1.deselectByVisibleText("Austrolia");
		Thread.sleep(2000);
		s1.deselectByIndex(2);
		Thread.sleep(2000);
		*/
		Thread.sleep(2000);
		s1.deselectAll();
		Thread.sleep(2000);
		driver.close();
	}

}
