package com.rameshsoft.automation.application.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.listeners.ReRunFailedTestCases;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;
import com.relevantcodes.extentreports.LogStatus;


public class GmailTest extends BaseTest {
	
	@Test(retryAnalyzer=ReRunFailedTestCases.class)
	public void gamilTest() throws IOException, FrameWorkException
	{
		getExtentTest().log(LogStatus.PASS, "Browser is opened");
		String url =PojoReader.getconPrObj().getValue("qa_url");
		getWebDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);
		
		
		
		String unData=PojoReader.getExcelReader().getCellData("sheetname", "realtime", 0, 0);
		System.out.println("USERNAME cellvalue data is:"+unData);
		
		
		
		String un_id_value =PojoReader.getorPrObj().getValue("un_id");
		String next_id_value =PojoReader.getorPrObj().getValue("next_id");
		
		WebElement userName = getWebDriver().findElement(By.id(un_id_value));
		userName.clear();
		getExtentTest().log(LogStatus.PASS, "USERNAME web element is cleared");
		userName.sendKeys(unData);
		getExtentTest().log(LogStatus.PASS, "Data typing actions on username with test data is:"+unData);
		WebElement nxt = getWebDriver().findElement(By.id(next_id_value));
		nxt.click();
		getExtentTest().log(LogStatus.PASS, "click on next element");
		
	}

}
