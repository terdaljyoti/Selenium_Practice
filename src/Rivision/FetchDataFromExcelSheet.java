package Rivision;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int LastRowIndex = sh.getLastRowNum();
		for(int i=0;i<=LastRowIndex;i++)
		{
			int LastCellIndex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=LastCellIndex;j++)
			{
				Cell CellInfo = sh.getRow(i).getCell(j);
				CellType type=CellInfo.getCellType();
				if(type==CellType.STRING)
				{
					String value = CellInfo.getStringCellValue();
					System.out.print(value+" ");
					
				}
				else if (type==CellType.NUMERIC)
				{
					double value = CellInfo.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if (type==CellType.BOOLEAN)
				{
					boolean value = CellInfo.getBooleanCellValue();
					System.out.print(value+" ");
				}
			}
			System.out.println();
		}
	}

}
