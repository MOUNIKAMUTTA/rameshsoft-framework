package com.rameshsoft.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTestCases implements IRetryAnalyzer{
	int retryCount=0;
	int maxRetryCount=3;

	@Override
	public boolean retry(ITestResult result) {
		
		
		if(result.getStatus()==ITestResult.FAILURE&&retryCount<=maxRetryCount)
		{
			try {
				Thread.sleep(3000);
				System.out.println("count is : "+retryCount+" executing testcase:"+result.getName());
				retryCount++;
				return true;
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		return false;
	}
	
	

}
