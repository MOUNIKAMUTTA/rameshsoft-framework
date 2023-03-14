package com.rameshsoft.automation.utilities;

public interface DriverPaths {
	
	String ieKey ="webdriver.ie.driver";
	String ieValue=System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe ";
	

	String edgeKey ="webdriver.edge.driver";
	String edgeValue=System.getProperty("user.dir")+"\\driver\\msedgedriver.exe ";
	

	String firefoxKey ="webdriver.gecko.driver";
	String firefoxValue=System.getProperty("user.dir")+"\\driver\\geckodriver.exe ";
	

	String chromeKey ="webdriver.chrome.driver";
	String chromeValue=System.getProperty("user.dir")+"\\driver\\chromedriver.exe ";
	  

	
	
}
