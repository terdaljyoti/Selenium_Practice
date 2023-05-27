package HandleMultipleElementsAtATime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/MultiPleTextBox.html");
		List<WebElement> allTextBox = driver.findElements(By.xpath("//input[@type='text']"));
		
		
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastCellIndex;i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			allTextBox.get(i).sendKeys(value);
			Thread.sleep(500);
		}
		
		Thread.sleep(2000);
		
	/*	for(int i=allTextBox.size()-1;i>=0;i--)
		{
			allTextBox.get(i).clear();
			Thread.sleep(500);
		}
		
		*/
		for(int i=0;i<=allTextBox.size()-1;i++)
		{
			allTextBox.get(i).clear();
			Thread.sleep(500);
		}
	}

}
