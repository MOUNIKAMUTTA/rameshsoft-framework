package com.raameshsoft.automation.application.objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		 
		//File file = new File("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\config.properties");
		
		//FileInputStream fip = new FileInputStream(file);
		
		FileInputStream fip = new FileInputStream("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\config.properties");
		
		Properties properties = new Properties();
		
		properties.load(fip);
		
		/*String qa_url_value = properties.getProperty("qa_url");
		System.out.println("qa_url = " +qa_url_value);
		String qa_un_value = properties.getProperty("qa_un");
		System.out.println("qa_un = "+ qa_un_value);
		String qa_pwd_value = properties.getProperty("qa_pwd");
		System.out.println("qa_pwd = "+qa_pwd_value);
		String qa_pwd_value1 = properties.getProperty("qa_pwd456","HARDWORK");
		System.out.println("qa_pwd = "+qa_pwd_value1);
		*/
		properties.setProperty("hello", "hardwork");
		properties.setProperty("java", "hardwork");
		properties.setProperty("hardwork", "job");
		properties.setProperty("job", "practice");
		properties.setProperty("hello", "do hardwork");
		
		properties.put("salary", "employee");
		
		FileOutputStream fop = new FileOutputStream("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\config.properties");
		
		
		properties.store(fop, "file is saved successfully");
		
		
		
		
		
		
		
		
		
		
	}

}
