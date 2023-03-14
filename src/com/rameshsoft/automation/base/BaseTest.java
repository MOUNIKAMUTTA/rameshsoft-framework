package com.rameshsoft.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import com.rameshsoft.automation.utilities.DriverPaths;
import com.rameshsoft.automation.utilities.ScreenShotUtility;
import com.rameshsoft.customisedexceptions.FrameWorkException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import lombok.Getter;



public class BaseTest {
	@Getter private static WebDriver webDriver;
    @Getter  private static String tcName;
	 @Getter private static ExtentReports extentReports ;
	 @Getter private static ExtentTest extentTest;
	
	
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String browser) {
		
		
		if(browser.equalsIgnoreCase("edge"))
		{
		  System.setProperty(DriverPaths.edgeKey,DriverPaths.edgeValue);
		  webDriver = new EdgeDriver();
          init();
		
		
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			
		  System.setProperty(DriverPaths.chromeKey,DriverPaths.chromeValue);	
		  webDriver = new ChromeDriver();
		  init();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(DriverPaths.firefoxKey,DriverPaths.firefoxValue);	
			webDriver = new FirefoxDriver();
			init();
		}
		else if(browser.equalsIgnoreCase("ie")) 
		{
			System.setProperty(DriverPaths.ieKey,DriverPaths.ieValue);	
			webDriver = new InternetExplorerDriver();
			init();

	    }
	
	}
	private void init()
	{
		webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        
		
	}
	@BeforeTest
	public void initReports()
	{
		extentReports= new ExtentReports(System.getProperty("user.dir")+"\\Reports\\reports.html");
		Map<String,String>  map = new HashMap<String,String>();
		map.put("user", "mounika");
		map.put("name", "RameshSoft");
		map.put("JOB", "SALARY");
		map.put("forgive", "happiness");
		map.put("suite", "regression suite");
		extentReports.addSystemInfo(map);
					
	}
     @AfterSuite
    public void closeBrowser() {
	if(webDriver!=null)
	{
		webDriver.close();
	}
	else
	{
		//throw exception
		System.out.println("webdriver is pointing to null");
	}
	
	}
     @BeforeMethod
     public void beforeTCExecution(Method method)
     {
    	 String tcName = method.getName();
    	 System.out.println("current execution test case is :"+tcName);
    	 extentTest=extentReports.startTest(tcName);
    	 extentTest.log(LogStatus.PASS, "current execution test case is :"+tcName);
    	 
     }
     @AfterMethod
     public void afterTCExecution(ITestResult result) throws IOException
     {
    	 tcName = result.getName();
    	 if(result.getStatus()==ITestResult.SUCCESS)
    	 {
    		 System.out.println("Testcase passed:"+tcName);
    		 extentTest.log(LogStatus.PASS, "test case passed:"+tcName);
    		 	 
    	 }
    	 else if(result.getStatus()==ITestResult.FAILURE)
    	 {
    		 System.out.println("Testcase failed: "+tcName);
    		 
    		//ScreenShotUtility.takeScreenShot();
    		 ScreenShotUtility.takeScreenShot(tcName,result.getThrowable().toString());
    		
    		 extentTest.log(LogStatus.FAIL," test case failed:"+tcName );
    		 extentTest.log(LogStatus.FAIL," test case failed:"+ result.getThrowable().toString());
    	 }
    	 else if(result.getStatus()==ITestResult.SKIP)
    	 {
    		 System.out.println("Testcase skipped: "+tcName);
    		 
    		ScreenShotUtility.takeScreenShot(tcName,result.getThrowable().toString());
    		extentTest.log(LogStatus.SKIP," test case skipped:"+tcName );
    		
    		extentTest.log(LogStatus.SKIP, "test case skipped:"+result.getThrowable().toString());
    		 
    	 }
    	 extentReports.endTest(extentTest);
    	 extentReports.flush();
    	 
     }
     @AfterTest
     public void closeReports() throws FrameWorkException
     {
    	 if(extentReports!=null)
    	 {
    		extentReports.close();
    		 extentTest.log(LogStatus.PASS, "extent reports are closed");
    	 }
    	 else
    	 {
    		 //throw exception
    		 System.out.println("extent reports is pointing to null");
    		 FrameWorkException exception = new FrameWorkException("extent reports is pointing to null");
    		 throw exception;
    	 }
     }
    
   //getter methods
    /* public static WebDriver getWebDriver()
     {
    	 return webDriver;
     }
     public static String getTcName()
     {
    	 return tcName;
     }   
	 public static ExtentReports getExtentReports()
	 {
		 return extentReports;
	 }
	 public static ExtentTest getExtentTest()
	 {
		 return extentTest;
	 }*/
	
}
