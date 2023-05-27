package Webelemnt_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_isSelected_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new account btn
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(3000);
		WebElement femaleRadioBtn=driver.findElement(By.xpath("//label[text()='Female']"));
		femaleRadioBtn.click();
		Thread.sleep(3000);
		boolean result = femaleRadioBtn.isSelected();
		System.out.println(result);
		if(result)
		{
			System.out.println("female radio button is selected");
		}
		else
		{
			System.out.println("female radio button is de-selected");
		}
		
	}

}
