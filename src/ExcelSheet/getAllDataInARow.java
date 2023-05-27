package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("G:\\\\Velocity Testing\\\\SeleniumPractice.xlsx");
		Sheet sh_1 = WorkbookFactory.create(file).getSheet("Sheet2");
		System.out.println("fetch all the data from row");
		int lastColIndex = sh_1.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastColIndex;i++)
		{
			System.out.print(sh_1.getRow(0).getCell(i).getStringCellValue()+" ");
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("fetch all the data from col");
		int lastRowIndex = sh_1.getLastRowNum();
		for(int i=0;i<=lastColIndex;i++)
		{
			System.out.println(sh_1.getRow(i).getCell(0).getRichStringCellValue()+" ");
		}

	}

}
