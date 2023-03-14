package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtilities {
	public static boolean isValidPhoneNum(String phoneNumber)
	{
		boolean status=true;
		Pattern pattern=Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
		Matcher matcher=pattern.matcher(phoneNumber);
		if(matcher.find()&&matcher.group().equalsIgnoreCase(phoneNumber))
		{
			System.out.println("it is a valid phone number");
		}
		else
		{
			System.out.println("it is not a valid phone number");
			status  = false;
		}
		return status;
	}

}
