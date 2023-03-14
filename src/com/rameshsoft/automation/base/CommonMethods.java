package com.rameshsoft.automation.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends ActionEngine{
	public static List<String> getTextWebElements(List<WebElement> listOfWebElements) {
		List<String> list=new ArrayList<String>();
		WebDriverWait wait=new WebDriverWait(getWebDriver(),45);
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfWebElements));
		for(WebElement webElement:listOfWebElements)
		{
			String txt=webElement.getText();
			list.add(txt);
		}
		return list;

	}

}
