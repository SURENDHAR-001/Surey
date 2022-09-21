package com.timeApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertTimeZoneTest {
	
	private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
	  public static void main(String args[]) throws InterruptedException, ParseException{
	      SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
	 
	      String dateInString = "09-04-2018 11:55:35 AM";
	      Date date = formatter.parse(dateInString);
	      TimeZone tz = TimeZone.getDefault();
	 
	      //From TimeZone Asia/Kolkata
	      System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
	      System.out.println("TimeZone : " + tz);
	      System.out.println("Date (Singapore) : " + formatter.format(date));
	 
	      //To TimeZone America/New_York
	      SimpleDateFormat sdfAmerica = new SimpleDateFormat(DATE_FORMAT);
	      TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
	      sdfAmerica.setTimeZone(tzInAmerica);
	 
	      String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
	      Date dateInAmerica = formatter.parse(sDateInAmerica); // Create a new Date object
	 
	      System.out.println("nTimeZone : " + tzInAmerica.getID() + " - " 
	                                                    + tzInAmerica.getDisplayName());
	      System.out.println("TimeZone : " + tzInAmerica);
	      System.out.println("Date (New York) (String) : " + sDateInAmerica);
	      System.out.println("Date (New York) (Object) : " + formatter.format(dateInAmerica));
	  }

}
