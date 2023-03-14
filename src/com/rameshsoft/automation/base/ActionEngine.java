package com.rameshsoft.automation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends BaseTest{
	private static WebElement webElement;
	private static List<WebElement> elements;
	public static void enterUrl(String Url) {
		try
		{
			getWebDriver().get(Url);
			getExtentTest().log(LogStatus.PASS, "url is entered as:"+Url);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.FAIL, "url is not entered as:"+Url);
		}

	}
	public static void navigateToUrl(String Url) {
		try
		{
			getWebDriver().navigate().to(Url);
			getExtentTest().log(LogStatus.PASS, "url is entered as:"+Url);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.FAIL, "url is not entered as:"+Url);
		}

	}
	public static void enterUrlJS(String Url) {
		try
		{
			getWebDriver().navigate().to(Url);
			getExtentTest().log(LogStatus.PASS, "url is entered as:"+Url);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.FAIL, "url is not entered as:"+Url);
		}

	}
	public static WebElement identifyElement(String how,String howValue) {
		switch(how)
		{
		case "id": webElement=getWebDriver().findElement(By.id(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
		           break;
		case "name": webElement=getWebDriver().findElement(By.name(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		case "className": webElement=getWebDriver().findElement(By.className(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		case "tagName": webElement=getWebDriver().findElement(By.tagName(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		case "linkText": webElement=getWebDriver().findElement(By.linkText(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		case "partiallinktext": webElement=getWebDriver().findElement(By.partialLinkText(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		case "xpath": webElement=getWebDriver().findElement(By.xpath(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		case "cssSelector": webElement=getWebDriver().findElement(By.cssSelector(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified element with :" +how);
                   break;
		}
		return webElement;

	}
	public static List<WebElement> identifyElements(String how,String howValue) {
		switch(how)
		{
		case "id": elements=getWebDriver().findElements(By.id(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
		           break;
		case "name": elements=getWebDriver().findElements(By.name(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		case "className":elements=getWebDriver().findElements(By.className(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		case "tagName": elements=getWebDriver().findElements(By.tagName(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		case "linkText": elements=getWebDriver().findElements(By.linkText(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		case "partiallinktext":elements=getWebDriver().findElements(By.partialLinkText(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		case "xpath": elements=getWebDriver().findElements(By.xpath(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		case "cssSelector": elements=getWebDriver().findElements(By.cssSelector(howValue));
		getExtentTest().log(LogStatus.PASS, "Identified elements with :" +how);
                   break;
		}
		return elements;

	}
	public static void DTA(WebElement webElement,String testData,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			webElement.clear();
			getExtentTest().log(LogStatus.PASS, "webelement is :" +webElementName+ "cleared");
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "datatyping actions is done on webelement:" +webElementName+ "with test dats is:"+testData);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void DTAJS(WebElement webElement,String testData,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			webElement.clear();
			getExtentTest().log(LogStatus.PASS, "webelement is :" +webElementName+ "cleared");
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "datatyping actions is done on webelement:" +webElementName+ "with test dats is:"+testData);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}

	public static void DTAByActionsOne(WebElement webElement,String testData,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			Actions actions = new Actions(getWebDriver());
			actions.click(webElement).sendKeys(testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "datatyping actions is done on webelement:" +webElementName+ "with test dats is:"+testData);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void click(WebElement webElement,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			webElement.click();
			Thread.sleep(5000);
			getExtentTest().log(LogStatus.PASS, "clicked on webelement:" +webElementName);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void clickByJS(WebElement webElement,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			webElement.click();
			getExtentTest().log(LogStatus.PASS, "clicked on webelement:" +webElementName);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void clickByActions(WebElement webElement,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			Actions actions = new Actions(getWebDriver());
			actions.click(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "clicked on webelement:" +webElementName);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void clickByActionsOne(WebElement webElement,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			Actions actions = new Actions(getWebDriver());
			actions.doubleClick(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "clicked on webelement:" +webElementName);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void DropDowns(WebElement webElement,String webElementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +webElementName+ "dispalyed & enabled");
			Actions actions = new Actions(getWebDriver());
			actions.doubleClick(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "clicked on webelement:" +webElementName);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +webElementName+ "dispalyed & enabled");
		}
		
	}
	public static void handleDropDowns(WebElement dropDown,String how,String howValue,String dropDownName) {
		try {
			Assert.assertTrue(dropDown.isDisplayed()&&dropDown.isEnabled());
			getExtentTest().log(LogStatus.PASS, "webelement is : " +dropDownName+ "dispalyed & enabled");
			Select select = new Select(dropDown);
			if(how.equalsIgnoreCase("value"))
			{
				select.selectByValue(howValue);
				
			}
			else if(how.equalsIgnoreCase("text"))
			{
				select.selectByVisibleText(howValue);
			}
			else if(how.equalsIgnoreCase("index"))
			{
				int index=Integer.parseInt(howValue);
				select.selectByIndex(index);
			}
			getExtentTest().log(LogStatus.PASS, "clicked on webelement is :" +dropDownName);
			
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.PASS, "webelement is not : " +dropDownName+ "dispalyed & enabled");
		}
		

	}
	public static void handleWindows() {
		try {
			String currentWindowName=getWebDriver().getWindowHandle();
			Set<String> allWindows=getWebDriver().getWindowHandles();
			getExtentTest().log(LogStatus.PASS, "all windows are:" +allWindows);
			for(String str :allWindows)
			{
				if(!str.equalsIgnoreCase(currentWindowName))
				{
					getWebDriver().switchTo().window(str);
					getExtentTest().log(LogStatus.PASS, "switched to window:"+str);
				}
			}
		}
		catch(Exception exception)
		{
			
		}

	}
	public static void handleWindows(int index) {
		try {
			
			Set<String> allWindows=getWebDriver().getWindowHandles();
			getExtentTest().log(LogStatus.PASS, "all windows are:" +allWindows);
			List<String> listWindows = new ArrayList<String>(allWindows);
			String windowName =listWindows.get(index);
			getWebDriver().switchTo().window(windowName);
			getExtentTest().log(LogStatus.PASS, "switched to window: "+windowName);
		}
		catch(Exception exception)
		{
			
		}

	}
	public static void mouseOverAction(WebElement element,String elementName)
	{
		try {
		Actions actions=new Actions(getWebDriver());
		actions.moveToElement(element).build().perform();
		getExtentTest().log(LogStatus.PASS, "performed mouse over on: "+elementName);
		}
		catch(Exception exception)
		{
			getExtentTest().log(LogStatus.FAIL, "mouse over not happened on:"+elementName);
		}
	}
	

}
