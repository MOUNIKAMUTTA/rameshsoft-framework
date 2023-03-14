package com.rameshsoft.automation.application.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;

public class FbTest extends BaseTest{
	
    @Test
	public void fbTest() throws IOException, FrameWorkException
	{
       
		String url =PojoReader.getconPrObj().getValue("fb_url");
		getWebDriver().get(url);
		
	}
}
