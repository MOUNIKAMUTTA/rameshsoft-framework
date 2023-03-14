package com.rameshsoft.automation.application.businessscripts;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ValidationsDemo {
	public static void main(String[] args) {
		int num1=55,num2=655; 
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("1");
		System.out.println("2");
		//softAssert.assertEquals(num1, num2);
		Assert.assertEquals(num1, num2);
		System.out.println("3");
		System.out.println("4");
		
	}

}
