package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.rameshsoft.customisedexceptions.FrameWorkException;

public class ExcelReader {
	private String filePath;
	private FileInputStream fip;
	private Workbook workbook;
	private Sheet sheet;
	private int rowCount;
	private Row row;
	private Cell cell;
	private String cellData;
	
	public ExcelReader(String filePath) throws EncryptedDocumentException, IOException
	{
		this.filePath=filePath;
	    fip = new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fip);	
	}
	public Sheet getSheetObj(String how,String howValue)
	{
		if(workbook!=null)
		{
			if(how.equalsIgnoreCase("sheetname"))
			{
				sheet=workbook.getSheet(howValue);
			}
			else if(how.equalsIgnoreCase("index"))
			{
				int index=Integer.parseInt(howValue);
				sheet=workbook.getSheetAt(index);
			}
		}
		else
		{
			//throw exception
			System.out.println("workbook is pointing to null");
		}
		return sheet;
	}
	public int getTotalRowCount(String how,String howValue) throws FrameWorkException
	{
		sheet=getSheetObj(how,howValue);
		if(sheet!=null)
		{
			rowCount=sheet.getLastRowNum();
		}
		else
		{
			//throw exception
			System.out.println("sheet is pointing to null");
			 FrameWorkException exception = new FrameWorkException("sheet is pointing to null");
    		 throw exception;
		}
		return rowCount;
	}
	public String getCellData(String how,String howValue,int rowNum,int cellNum) {
		sheet=getSheetObj(how,howValue);
		if(sheet!=null)
		{
			row=sheet.getRow(rowNum);
			if(row!=null)
			{
			 cell=row.getCell(cellNum);
			 if(cell!=null)
			 {
				 if(cell.getCellType()==CellType.STRING)
					{
						cellData=cell.getStringCellValue();
						System.out.println(cellData);
					}
					else if(cell.getCellType()==CellType.NUMERIC)
					{
						cellData=cell.getNumericCellValue()+"";
						System.out.println(cellData);
					}
					else if(cell.getCellType()==CellType.BOOLEAN)
					{
						cellData=cell.getBooleanCellValue()+"";
						System.out.println(cellData);
						
					}
					
			 }
			 else
			 {
				 //throw exception
				 System.out.println("cell is pointing to null");
			 }
			 
				
			}
			else
			{
				//throw exception
				System.out.println("row is pointing to null");
			}
		}
		else
		{
			//throw exception
			System.out.println("sheet is pointing to null");	
		}
		
         return cellData;
	}
	public List<String> getSheetData(String how,String howValue)
	{
		List<String> excelData = new ArrayList<String>();
		sheet=getSheetObj(how,howValue);
		if(sheet!=null)
		{
			for(int i=0;i<sheet.getLastRowNum();i++)
			{
				row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++)
				{
					cell = row.getCell(j);
					if(cell.getCellType()==CellType.STRING)
					{
						cellData=cell.getStringCellValue();
						excelData.add(cellData);
					}
					else if(cell.getCellType()==CellType.NUMERIC)
					{
						cellData=cell.getNumericCellValue()+"";
						excelData.add(cellData);
						
					}
					else if(cell.getCellType()==CellType.BOOLEAN)
					{
						cellData=cell.getBooleanCellValue()+"";
						excelData.add(cellData);
						
					}	
					
				}
			}
		}
		else
		{
			//throw exception
			System.out.println("sheet is pointing to null");
		}
		return excelData;
		
	}
	
	

}
