package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataFromRowByVerifyingType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int LastcellIndex=sh.getRow(1).getLastCellNum()-1;
		
		for(int i=0;i<=LastcellIndex;i++)
		{
			Cell cellInfo = sh.getRow(0).getCell(i);
			CellType type = cellInfo.getCellType();
			
			if(type==CellType.STRING)
			{
				String value = cellInfo.getStringCellValue();
				System.out.print(value+" "); 
			}
			else if(type==CellType.NUMERIC)
			{
				double value = cellInfo.getNumericCellValue();
				System.out.print(value+" "); 
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean value = cellInfo.getBooleanCellValue();
				System.out.print(value+" "); 
			}
		}
		
	}

}
