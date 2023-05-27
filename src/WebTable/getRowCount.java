package WebTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class getRowCount 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		// rowCount
		
		int rowCount = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr")).size();
		System.out.println("Row Count : "+rowCount);
		
		// columncount
		
		int colSize = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr[1]//th")).size();
		System.out.println("column count : "+colSize);
		
		//record count
		
		int CountRecord = driver.findElements(By.xpath("(//table[@id='product'])[1]//td")).size();
		System.out.println("record count : "+CountRecord);
		
		//capture value
		
		String value = driver.findElement(By.xpath("(//table[@id='product'])[1]//tr[4]//td[2]")).getText();
		System.out.println(value);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		// rowCount
		
		int rowCount_1 = driver.findElements(By.xpath("(//table)[1]//tr")).size();
		System.out.println("Row Count : "+rowCount_1);
		
		// columncount
		
		int colSize_1 = driver.findElements(By.xpath("((//table)[1]//tr)[1]//th")).size();
		System.out.println("column count : "+colSize_1);
		
		//record count
		
		int CountRecord_1 = driver.findElements(By.xpath("(//table)[1]//td")).size();
		System.out.println("record count : "+CountRecord_1);
		
		//capture value
		
		String value_1 = driver.findElement(By.xpath("(//table)[2]//tr[4]/td[3]")).getText();
		System.out.println(value_1);
		
		List<WebElement> allData = driver.findElements(By.xpath("(//table)[1]//td"));
		for(WebElement a:allData)
		{
			String text = a.getText();
			System.out.println(text);
			
		}
		
		
	}

}
