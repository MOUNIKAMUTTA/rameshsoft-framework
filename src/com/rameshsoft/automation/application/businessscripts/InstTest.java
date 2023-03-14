package com.rameshsoft.automation.application.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.utilities.PojoReader;
import com.rameshsoft.customisedexceptions.FrameWorkException;

public class InstTest extends BaseTest{
	@Test
	public void instTest() throws IOException, FrameWorkException
	{
        
		String url =PojoReader.getconPrObj().getValue("inst_url");
		getWebDriver().get(url);
		
		
	}

}
