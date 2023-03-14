package com.rameshsoft.automation.application.pageobjects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class ProductsPage extends ActionEngine{
	static
	{
	   PageFactory.initElements(getWebDriver(), ProductsPage.class);
	}
	
	@FindBy(xpath="//li[@class='nav-item']/a[text()='Tablets']")
	private static WebElement tablets;
	
	@FindBy(xpath="//div[@class='button-group']/button[2]")
	private static WebElement addToWishlist;
	
	public static  void ClickTablets() {
		click(tablets, "Tablets");
	}
	
     public static  void clickAddWishListIcon() {
		click(addToWishlist, "Add To WishList");
	}
    
    public static String getActualTextDisplayed() {
		
    	String actualText=addToWishlist.getText();
    	getExtentTest().log(LogStatus.PASS, "actual text displayed  is:"+actualText);
    	System.out.println("actual text displayed is:"+actualText);
    	return actualText;
	}
    public  static String getExpectedTextDisplayed() throws EncryptedDocumentException, IOException {
		String expectedText=PojoReader.getExcelReader().getCellData("SheetName", "OpenCart", 0, 0);
		getExtentTest().log(LogStatus.PASS, "expected text displayed is:"+expectedText);
		return expectedText;
	}
    public static void verifyTextDispalyed() throws EncryptedDocumentException, IOException
    {
    	String actualText=getActualTextDisplayed();
    	String expectedText=getExpectedTextDisplayed();
    	if(actualText.equals(expectedText))
    	{
    		getExtentTest().log(LogStatus.PASS, "text displayed is matched :"+actualText+" "+expectedText);
    	}
    	else
    	{
    		getExtentTest().log(LogStatus.FAIL, "text displayed is NOT matched :"+actualText+" "+expectedText);
    	}
    	
    }
}
