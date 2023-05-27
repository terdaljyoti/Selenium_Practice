package HandleMultipleElementsAtATime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/MultiPleTextBox.html");
		driver.manage().window().maximize();
		
		List<WebElement> allTextBOX = driver.findElements(By.xpath("//input[@type='text']"));
		
		ArrayList<String>ar=new ArrayList<String>();
		
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");

		int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=LastCellIndex;i++)
		{
			 String value = sh.getRow(0).getCell(i).getStringCellValue();
			 ar.add(value);
		}
		for(int k=0;k<=ar.size()-1;k++)
		{
			allTextBOX.get(k).sendKeys(ar.get(k));
		}
		
	}

}
