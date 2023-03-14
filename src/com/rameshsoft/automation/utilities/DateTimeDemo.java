package com.rameshsoft.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		LocalDate tommorowdate = localdate.plusDays(1);
		System.out.println(tommorowdate);
		LocalDate dayaftertommorowdate = localdate.plusDays(2);
		System.out.println(dayaftertommorowdate);
		LocalDate yesterdaydate = localdate.minusDays(1);
		System.out.println(yesterdaydate);
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localdatetime=LocalDateTime.now();
		System.out.println(localdatetime);
		
		
	}

}
