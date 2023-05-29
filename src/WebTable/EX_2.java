package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2 
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int RowCount = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println(RowCount);
		
		String value = driver.findElement(By.xpath("(//table)[2]//tr[12]//td[4]")).getText();
		System.out.println(value);
	}

}
