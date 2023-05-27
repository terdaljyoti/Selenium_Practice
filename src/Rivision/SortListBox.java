package Rivision;

import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortListBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		List<WebElement> AllOptions = s1.getOptions();
		TreeSet<String> tr=new TreeSet<String>();
		System.out.println("-----Before Swapping------ :");
		
		for(WebElement a:AllOptions)
		{
			System.out.print(a.getText()+" ");			
		}
		
		
		for(WebElement al:AllOptions)
		{
		String S = al.getText();	
		tr.add(S);
		}
		System.out.println();
		System.out.println("-------After Swapping------- :");
		for(String all:tr)
		{
			System.out.print(all+" ");
		}
		
		driver.close();

	}
}
