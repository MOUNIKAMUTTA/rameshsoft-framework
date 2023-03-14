package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.base.BaseTest;

public interface ScreenShotUtility {
	
	public static String takeScreenShot() throws IOException
	{
		
		 TakesScreenshot takescreenshot = (TakesScreenshot) BaseTest.getWebDriver();
		 File image = takescreenshot.getScreenshotAs(OutputType.FILE);
		 String imagePath = System.getProperty("user.dir")+"\\screenshots\\"+BaseTest.getTcName()+".jpeg";
		FileUtils.copyFile(image, new File(imagePath));
		return imagePath;
		 
	}
	public static String takeScreenShot(String tcName,String exceptionMsg) throws IOException
	{
		
		 TakesScreenshot takescreenshot = (TakesScreenshot) BaseTest.getWebDriver();
		 System.out.println("test case is failed"+tcName+"so taking screen shot and the exception message is:"+exceptionMsg);
		 File image = takescreenshot.getScreenshotAs(OutputType.FILE);
		 String imagePath = System.getProperty("user.dir")+"\\screenshots\\"+tcName+".jpeg";
		 FileUtils.copyFile(image, new File(imagePath));
		 return imagePath;
	}	 

}
