package com.rameshsoft.automation.application.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fip = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\src\\com\\rameshsoft\\automation\\application\\testdata\\Book1.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet=workbook.getSheet("mouni");
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cell=row.getCell(j);
				if(cell.getCellType()==CellType.STRING)
				{
					String cellValue=cell.getStringCellValue();
					System.out.println(cellValue);
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					Double cellValue=cell.getNumericCellValue();
					System.out.println(cellValue);
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					Boolean cellValue=cell.getBooleanCellValue();
					System.out.println(cellValue);
					
				}
				
			}
			
		}
		
	}

}
