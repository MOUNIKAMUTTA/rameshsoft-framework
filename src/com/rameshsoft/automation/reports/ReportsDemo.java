package com.rameshsoft.automation.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo {
	public static void main(String[] args) {
		ExtentReports extentReports = new ExtentReports("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\Reports\\reports.html");
		Map<String,String>  map = new HashMap<String,String>();
		map.put("user", "mounika");
		map.put("name", "RameshSoft");
		map.put("JOB", "SALARY");
		map.put("forgive", "happiness");
		map.put("suite", "regression suite");
		extentReports.addSystemInfo(map);
		
		ExtentTest extentTest = extentReports.startTest("hardwork");
		 
		extentTest.log(LogStatus.PASS, "Browser is opened");
		extentTest.log(LogStatus.PASS, "Entered URL as:www.gmail.com");
		extentTest.log(LogStatus.PASS,  "DTA is done on username with test data as mounikamutta1");
		extentTest.log(LogStatus.PASS, "click on NEXT button");
		extentTest.log(LogStatus.PASS, "DTA is done on password with test data as 1@ramadevi");
		extentTest.log(LogStatus.PASS, "click on signin button");
		extentTest.log(LogStatus.PASS, "Browser is closed");
		
		extentReports.endTest(extentTest);
		extentReports.flush();
		extentReports.close();
		
		
		
		
		
	}

}
