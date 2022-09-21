package com.timeApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDateTest {
	
	public static void main(String args[]){
		  try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		        Date date1 = sdf.parse("2018-04-09");
		        Date date2 = sdf.parse("2017-01-31");
	 
		        System.out.println("date1 : " + sdf.format(date1));
		        System.out.println("date2 : " + sdf.format(date2));
	 
		        if (date1.compareTo(date2) > 0) {
		            System.out.println("Date1 is after Date2");
		        } else if (date1.compareTo(date2) < 0) {
		            System.out.println("Date1 is before Date2");
		        } else if (date1.compareTo(date2) == 0) {
		            System.out.println("Date1 is equal to Date2");
		        }
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }

}
