package com.rameshsoft.automation.application.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.ActionEngine;

public class GmailPwdPage extends ActionEngine{
	static
	{
		PageFactory.initElements(getWebDriver(),GmailPwdPage.class );
		
	}
	
	@FindBy(name="password")
	private static WebElement password;
	
	@FindBy(id="passwordNext")
	private static WebElement signIn;
	
	@FindBy(xpath="//div[text()='show Password']")
	private static WebElement showPassword;
	

	@FindBy(xpath="//span[text()='forget Password?']")
	private static WebElement forgetPassword;
	
	public static void enterPassword(String pwdData)
	{
		DTA(password, pwdData, "PassWord");
	}
	public static void clickSignInBtn()
	{
		click(signIn, "sign in");
	}
	public static void clickShowPassword()
	{
		click(showPassword,"Show Password");	
	}
	public static void clickForgetPassword()
	{
		click(forgetPassword,"Forget Password");	
	}
	

}
