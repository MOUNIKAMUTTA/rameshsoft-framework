package com.rameshsoft.automation.application.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fip = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\src\\com\\rameshsoft\\automation\\application\\testdata\\Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		
		Sheet sheet=workbook.getSheet("mouni");
		
		//sheet.createRow(0);
		Row row1=sheet.getRow(1);
		Cell cell13=row1.createCell(3);
		cell13.setCellValue("forgetpast");
		
		Row row8=sheet.createRow(8);
		Cell cell80=row8.createCell(0);
		cell80.setCellValue("livelife");
		Cell cell81=row8.createCell(1);
		cell81.setCellValue("happily");
		Cell cell82=row8.createCell(2);
		cell82.setCellValue("withoutRegret");
		FileOutputStream fop= new FileOutputStream("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\src\\com\\rameshsoft\\automation\\application\\testdata\\Book1.xlsx");
		workbook.write(fop);
		
		
		
		
		
		
	}

}
