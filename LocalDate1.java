package com.timeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDate1 {
	
	public static void main(String args[]){
	    LocalDate date = LocalDate.now();  
	    LocalDate yesterday = date.minusDays(1);  
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    System.out.println("Today: "+date);  
	    System.out.println("Yesterday: "+yesterday);  
	    System.out.println("Tommorow: "+tomorrow);  
 
	    LocalDate date1 = LocalDate.of(2018, 1, 16); 
	    System.out.println(date1);
	    
	    System.out.println(date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2016, 9, 23);  
	    System.out.println(date2);
	    System.out.println(date2.isLeapYear()); 
	    
	    LocalTime time=LocalTime.now();
	    
	    Duration fiveHours = Duration.ofHours(5);
	    
	    System.out.println(time);
	    LocalTime oneHour=time.minus(fiveHours);
	    System.out.println(oneHour);
	}  

}
