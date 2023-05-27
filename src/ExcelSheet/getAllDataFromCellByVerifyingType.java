package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.jdi.Value;

public class getAllDataFromCellByVerifyingType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int LastRowIndex=sh.getLastRowNum();
		for(int i=0;i<=LastRowIndex;i++)
		{
			Cell cellInfo = sh.getRow(i).getCell(0);
			CellType type = cellInfo.getCellType();
			
			if(type==CellType.STRING)
			{
				String value = cellInfo.getStringCellValue();
				System.out.println(value);
			}
			else if (type==CellType.NUMERIC) 
			{
				double value = cellInfo.getNumericCellValue();
				System.out.println(value);
				
			}
			else if (type==CellType.BOOLEAN)
			{
				boolean value = cellInfo.getBooleanCellValue();
				System.out.println(value);
			}
			
		}
		
		
	}

}
