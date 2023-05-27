package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedOPtionFrom_SingleSelectableListBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
	
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		//Thread.sleep(3000);
		
		s1.selectByIndex(3);
		Thread.sleep(2000);
		s1.selectByValue("6");
		Thread.sleep(2000);
		s1.selectByVisibleText("Dec");
		
		WebElement selectOption = s1.getFirstSelectedOption();
		String selectOption_text = selectOption.getText();
		System.out.println(selectOption_text);
		driver.close();
		
	}

}
