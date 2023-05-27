package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getValue
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new 
		FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		String value = WorkbookFactory.create(file).getSheet("sheet3").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
	}

}
