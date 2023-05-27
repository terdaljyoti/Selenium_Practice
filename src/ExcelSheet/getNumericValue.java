package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getNumericValue 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\28JanEve.xlsx");
		//double value = WorkbookFactory.create(file).getSheet("sheet2").getRow(3).getCell(1).getNumericCellValue();
		//System.out.println(value);
		


		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("sheet2");
		
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		String un = sheet.getRow(0).getCell(0).getStringCellValue();
		boolean result = sheet.getRow(3).getCell(3).getBooleanCellValue();
		
		System.out.println(pass);
		System.out.println(un);
		System.out.println(result);
		
		System.out.println("--------------------------------------------------------------------------------");		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		userName.sendKeys(un);
		Thread.sleep(2000);
		
		String un_text = userName.getAttribute("value");
		System.out.println(un_text);
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys(pass);
		String pass_text = password.getAttribute("value");
		System.out.println(pass_text);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	
	} 
	

}
