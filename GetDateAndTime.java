package com.timeApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateAndTime {
	
	public static void main(String args[]){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date);
	}

}
