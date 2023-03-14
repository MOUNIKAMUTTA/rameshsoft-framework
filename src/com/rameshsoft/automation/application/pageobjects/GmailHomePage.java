package com.rameshsoft.automation.application.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.ActionEngine;

public class GmailHomePage extends ActionEngine{
	static
	{
		PageFactory.initElements(getWebDriver(),GmailHomePage.class );
		
	}
	
	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(xpath="//*[@id='identifierNext']")
	private static WebElement nxt;
	
	@FindBy(xpath="//button[text()='Forgot email?']")
	private static WebElement forgetEmail;
	

	@FindBy(xpath="//a[text()='Learn more']")
	private static WebElement learnMore;
	
	@FindBy(xpath="//span[text()='Create account']")
	private static WebElement createAccount;
	
	public static void enterUserName(String unData)
	{
		DTA(userName, unData, "UserName");
	}
	public static void clickNxtBtn()
	{
		click(nxt, "Next");
	}
	public static void clickCreateAccount()
	{
		click(createAccount,"Create Account");	
	}
	public static void clickLearnMore()
	{
		click(learnMore,"Learn More");	
	}
	

}
