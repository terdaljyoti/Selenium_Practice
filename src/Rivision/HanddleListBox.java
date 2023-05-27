package Rivision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HanddleListBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		
		boolean result = s1.isMultiple();
		System.out.println(result);
		
		s1.selectByIndex(2);
		WebElement Selected_Optin = s1.getFirstSelectedOption();
		System.out.println(Selected_Optin.getText());
		
		Thread.sleep(2000);
		
		s1.selectByValue("4");
		WebElement Option = s1.getFirstSelectedOption();
		System.out.println(Option.getText());
		
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Jan");
		WebElement Opt = s1.getFirstSelectedOption();
		System.out.println(Opt.getText());
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
