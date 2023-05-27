package ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sort_Month_listBox_With_treeSet 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		List<WebElement> AllOptions = s1.getOptions();
		
		TreeSet<String> tr=new TreeSet<String>();
		for(WebElement a:AllOptions)
		{
			String S = a.getText();
			tr.add(S);
		}
		
		for(String List:tr)
		{
			System.out.println(List);
		}
		
	}

}
