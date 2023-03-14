package com.rameshsoft.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesReader;
import com.rameshsoft.automation.supporters.TestReader;

public class PojoReader {
  public static PropertiesReader getconPrObj() throws IOException
  {
	  PropertiesReader prConf = new PropertiesReader(FilePaths.confFilePath);
	  return prConf;
  }
  public static PropertiesReader getorPrObj() throws IOException
  {
	  PropertiesReader prOr = new PropertiesReader(FilePaths.orFilePath);
	  return prOr;
  }
  public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException
  {
	 ExcelReader excelReader = new ExcelReader(FilePaths.excelFilePath) ;
	 return excelReader;
	 
  }
  public static TestReader getTestReader() throws IOException
  {
	  TestReader testReader = new TestReader(FilePaths.txtFilePath);
	  return testReader;
	  
  }
  
}
