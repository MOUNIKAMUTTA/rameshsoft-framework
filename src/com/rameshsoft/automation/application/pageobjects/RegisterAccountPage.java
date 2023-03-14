package com.rameshsoft.automation.application.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;

public class RegisterAccountPage extends ActionEngine{
	static
	{
		PageFactory.initElements(getWebDriver(),RegisterAccountPage.class );
	}
	@FindBy(xpath="//span[text()='My Account']")
	private static WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	private static WebElement registerAccount;
	
	@FindBy(id="input-firstname")
	private static WebElement firstName;
	
	@FindBy(id="input-lastname")
	private static WebElement lastName;
	
	@FindBy(id="input-email")
	private static WebElement enterEmail;
	
	@FindBy(id="input-password")
	private static WebElement enterPassword;
	
	@FindBy(id="input-newsletter-no")
	private static WebElement newsLetterRadioButton;
	
    @FindBy(xpath="//button[text()='Continue']")
    private static WebElement continueButton;
    
    public static void clickRegister() {
		mouseOverAction(myAccount, "My Account");
        clickByActions(registerAccount, "Register");
	}
    public static void enterDetails() throws FrameWorkException, IOException {
		DTA(firstName,PojoReader.getorPrObj().getValue("firstName"),"First Name");
		DTA(lastName,PojoReader.getorPrObj().getValue("lastName") , "Last Name");
		DTA(enterEmail,PojoReader.getorPrObj().getValue("emailId"), "E-mail");
	}
    public static void enterPassword() throws FrameWorkException, IOException {
		DTA(enterPassword,PojoReader.getorPrObj().getValue("password"), "Password");

	}

}
