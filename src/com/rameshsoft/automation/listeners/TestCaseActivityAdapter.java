package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.utilities.ScreenShotUtility;

public class TestCaseActivityAdapter extends TestListenerAdapter{
	
	@Override
    public void onTestStart(ITestResult arg0) {
	
	  System.out.println("Testcase execution started:"+arg0.getName());
    }
    
    @Override
    public void onTestSuccess(ITestResult arg0) {
    	
      System.out.println("Testcase execution is success:"+arg0.getName());	
    }
    
    @Override
	public void onTestFailure(ITestResult arg0) {
    	
    	System.out.println("Test case is failed:"+arg0.getName());
        
        try {
  		ScreenShotUtility.takeScreenShot(arg0.getName(),arg0.getThrowable().toString());
  	} catch (IOException e) {

  		e.printStackTrace();
  	}
  		
    }
    @Override
	public void onTestSkipped(ITestResult arg0) {
    	
    	
       System.out.println("Test case is Skipped:"+arg0.getName());
        
        try {
        ScreenShotUtility.takeScreenShot(arg0.getName(),arg0.getThrowable().toString());
  	} catch (IOException e) {

  		e.printStackTrace();
  	}
}
}