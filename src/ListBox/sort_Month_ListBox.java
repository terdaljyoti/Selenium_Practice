package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sort_Month_ListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		ArrayList<String> ar=new ArrayList<String>();
		List<WebElement> List = s1.getOptions();
		
		 for(WebElement l:List)
		 {
			String S = l.getText();
			ar.add(S);
			
		 }
		 
		 Collections.sort(ar);
		 
		 for(String a:ar)
		 {
			 System.out.println(a);
		 }		 
	}
	
}
