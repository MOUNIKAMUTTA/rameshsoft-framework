package com.rameshsoft.automation.utilities;

import java.time.LocalDate;

public interface DateTimeUtilities {
	public static String getCurrentYearMonthDate()
	{
		LocalDate localdate=LocalDate.now();
		String currentYearMonthDate=localdate.toString();
		return currentYearMonthDate;
	}

    public static int getCurrentDate()
    {
    	String currentYearMonthDate = getCurrentYearMonthDate();//2023-02-13
    	String[] str = currentYearMonthDate.split("-");//2023-02-13
    	                                               // 0    1  2
    	String date=str[str.length-1];
    	int currentDate=Integer.parseInt(date);
    	return currentDate; 	
    }
    public static int getCurrentMonth()
    {
    	String currentYearMonthDate = getCurrentYearMonthDate();//2023-02-13
    	String[] str = currentYearMonthDate.split("-");//2023-02-13
    	                                               // 0    1  2
    	String date=str[1];
    	int currentMonth=Integer.parseInt(date);
    	return currentMonth; 	
    }
    public static int getCurrentYear()
    {
    	String currentYearMonthDate = getCurrentYearMonthDate();//2023-02-13
    	String[] str = currentYearMonthDate.split("-");//2023-02-13
    	                                               // 0    1  2
    	String date=str[0];
    	int currentYear=Integer.parseInt(date);
    	return currentYear; 	
    }
    public static  String getPastDate(int minusDays)
    {
    	LocalDate localDate=LocalDate.now();
    	LocalDate pastDate=localDate.minusDays(minusDays);
    	return pastDate.toString();
    }
    public static  String getFutureDate(int plusDays)
    {
    	LocalDate localDate=LocalDate.now();
    	LocalDate futureDate=localDate.plusDays(plusDays);
    	return futureDate.toString();
    }
   
}
