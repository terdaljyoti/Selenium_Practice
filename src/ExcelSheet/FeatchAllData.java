package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FeatchAllData 
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
					Cell cellInfo = sh.getRow(i).getCell(j);
					CellType type = cellInfo.getCellType();
					if(type==CellType.STRING)
					{
						System.out.print(cellInfo.getStringCellValue()+" ");
					}
					else if(type==CellType.NUMERIC)
					{
						System.out.print(cellInfo.getNumericCellValue()+" ");
					}
					else if(type==CellType.STRING)
					{
						System.out.print(cellInfo.getBooleanCellValue()+" ");
					}
				}
				System.out.println();
			}
		
	}

}
