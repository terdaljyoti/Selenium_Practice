package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int LastRowIndex=sh.getLastRowNum();
		
		for(int i=0;i<=LastRowIndex;i++)
		{
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
	}

}
