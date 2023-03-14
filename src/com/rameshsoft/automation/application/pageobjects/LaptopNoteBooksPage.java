package com.rameshsoft.automation.application.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;

public class LaptopNoteBooksPage extends ActionEngine{
	static
	{
		PageFactory.initElements(getWebDriver(), LaptopNoteBooksPage.class);
	}
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private static WebElement LaptopNoteBooks;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private static WebElement ShowAllLaptopsNoteBooks;
	
	@FindBy(xpath="//aside[@id='column-left']/div/a[2]")
	private static WebElement LaptopsNoteBooksSize;
	
	@FindBys({@FindBy(xpath="//div[@class='product-thumb']/div/a")})
	private static List<WebElement> expectedLaptopNoteBooks;
	
	
	public static void mouseOverLaptopNoteBooks()
	{
		mouseOverAction(LaptopNoteBooks, "Laptops & Notebooks");
	}
	public static void clickShowAllLaptopsNoteBooks()
	{
		click(ShowAllLaptopsNoteBooks, "Show All Laptops &NoteBooks");
	}
	public static int getActualSizeLaptopNoteBooks() {
		 String txt=LaptopsNoteBooksSize.getText();//Laptops & Notebooks (5)
                                              //       0      1   2       3
		 getExtentTest().log(LogStatus.PASS, "Laptops Notebooks Text is:"+txt);
		 System.out.println( "Laptops Notebooks Text is:"+txt);
		String str[]= txt.split(" ");
		
		String txt1= str[3];//          (5)
		String str1[]=txt1.split("");// 012
		String actualLaptopNoteBooksSize=str1[1];//"5"
		int actualLaptopNoteBooksSize1=Integer.parseInt(actualLaptopNoteBooksSize);
		getExtentTest().log(LogStatus.PASS, "Laptops Notebooks count is:"+actualLaptopNoteBooksSize1);
		System.out.println("Laptops Notebooks count is:"+actualLaptopNoteBooksSize1);
		return actualLaptopNoteBooksSize1;
	
	}
	public static int getActualSizeLaptopNoteBookSize() {
		
		int expectedLaptopNoteBooksSize=expectedLaptopNoteBooks.size();
		return expectedLaptopNoteBooksSize;
	}
	public static void verifyLaptopNoteBooksSize()
	{
		int actualSize=getActualSizeLaptopNoteBooks();
		int expectedSize=getActualSizeLaptopNoteBooks();
		if(actualSize==expectedSize)
		{
			getExtentTest().log(LogStatus.PASS,"Laptop Notebooks size is matched:"+actualSize+" "+expectedSize);
		}
		else
		{
			getExtentTest().log(LogStatus.FAIL,"Laptop Notebooks size is NOT matched:"+actualSize+" "+expectedSize);
		}
	}

}
