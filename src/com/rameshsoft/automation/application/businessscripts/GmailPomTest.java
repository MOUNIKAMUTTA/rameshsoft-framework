package com.rameshsoft.automation.application.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.automation.application.pageobjects.GmailHomePage;
import com.rameshsoft.automation.application.pageobjects.GmailPwdPage;
import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;

public class GmailPomTest extends ActionEngine{
	@Test
	public void gmailLoginTest() throws FrameWorkException, IOException {
		enterUrl(PojoReader.getconPrObj().getValue("qa_url"));
		GmailHomePage.enterUserName(PojoReader.getExcelReader().getCellData("sheetname", "realtime", 0, 0));
		GmailHomePage.clickNxtBtn();;
		//GmailPwdPage.enterPassword(PojoReader.getExcelReader().getCellData("sheetname", "realtime", 0, 1);
         // GmailPwdPage.clickSignInBtn();
	}

}
