package com.rameshsoft.automation.application.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//TO READ DATA FROM EXCEL FILE WE SHOULD KNOW LOACTION OF FILE
		FileInputStream fip = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\src\\com\\rameshsoft\\automation\\application\\testdata\\Book1.xlsx");
		//File file = new File("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\src\\com\\rameshsoft\\automation\\application\\testdata\\Book1.xlsx");
		//FileInputStream fip = new FileInputStream(file);
		
		//TO GET THE WORKBOOK
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet=workbook.getSheet("mouni");
		//Sheet sheet=workbook.getSheetAt(1);
		Row row0 = sheet.getRow(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println("no.of rows in mouni sheet is:"+rowcount);
		
		int cellcount0thRow=row0.getLastCellNum();
		System.out.println(cellcount0thRow);
		Cell cell00=row0.getCell(0);
		String cell00Value=cell00.getStringCellValue();
		System.out.println(cell00Value);
		
         Cell cell01=row0.getCell(1);
         String cell01Value=cell01.getStringCellValue();
         System.out.println(cell01Value);
         
         Cell cell02=row0.getCell(2);
         double cell02Value=cell02.getNumericCellValue();
         System.out.println(cell02Value);
    }

}
