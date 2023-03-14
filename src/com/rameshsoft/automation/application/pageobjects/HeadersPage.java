package com.rameshsoft.automation.application.pageobjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.CommonMethods;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class HeadersPage extends ActionEngine{
	
	static
	{
		PageFactory.initElements(getWebDriver(), HeadersPage.class);
	}
	@FindBys(@FindBy(xpath="//div[@id='narbar-menu']/ul/li/a"))
	private static List<WebElement> headers;
	
	public static List<String> getElementsText() {
		List<String> headersData=CommonMethods.getTextWebElements(headers);
		return headersData;
	}
	public static List<String> getExpectedHeadersData() throws EncryptedDocumentException, IOException {
		String headerData=PojoReader.getExcelReader().getCellData("SheetName", "OpenCart", 1, 0);
		String[] headerData1=headerData.split(",");
		List<String> list=new ArrayList<>();
		for(String headersData:headerData1)
		{
			list.add(headerData);
		}
		return list;
	}
	public static void verifyHeaders() throws EncryptedDocumentException, IOException
	{
		List<String> actualHeadersData=getElementsText();
		List<String> expectedHeadersData=getExpectedHeadersData();
		Collections.sort(actualHeadersData);
		Collections.sort(expectedHeadersData);
		if(actualHeadersData==expectedHeadersData)
		{
			getExtentTest().log(LogStatus.PASS, "Headers are correct and matching");
			getExtentTest().log(LogStatus.PASS, actualHeadersData+"  "+expectedHeadersData);
		}
		else
		{
			getExtentTest().log(LogStatus.FAIL, "Headers are NOT correct and matching");
			getExtentTest().log(LogStatus.FAIL, actualHeadersData+"  "+expectedHeadersData);
		}
	}
	

}
