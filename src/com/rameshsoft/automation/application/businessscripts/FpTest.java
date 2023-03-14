package com.rameshsoft.automation.application.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;

public class FpTest extends BaseTest{
	
	@Test
	public void fpTest() throws IOException, FrameWorkException
	{
		String url =PojoReader.getconPrObj().getValue("fp_url");
		getWebDriver().get(url);
		
	}

}
