package com.rameshsoft.automation.application.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.automation.application.pageobjects.HeadersPage;
import com.rameshsoft.automation.application.pageobjects.LaptopNoteBooksPage;
import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;

public class OpencartTestCase extends ActionEngine{
	@Test
	public static void verifyLaptopNoteBooksCount() throws FrameWorkException, IOException {
		enterUrl(PojoReader.getconPrObj().getValue("opencart_url"));
		LaptopNoteBooksPage.mouseOverLaptopNoteBooks();
		LaptopNoteBooksPage.clickShowAllLaptopsNoteBooks();
		LaptopNoteBooksPage.getActualSizeLaptopNoteBooks();
		LaptopNoteBooksPage.verifyLaptopNoteBooksSize();	
	}
	@Test
	public static void verifyMainHeaders() throws FrameWorkException, IOException
	{
		enterUrl(PojoReader.getconPrObj().getValue("opencart_url"));
		HeadersPage.verifyHeaders();
		
	}

}
