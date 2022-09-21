package com.timeApi;

import java.util.TimeZone;

public class TimeZoneTest {
	
	public static void main(String args[]){
		   String[] id = TimeZone.getAvailableIDs();        
		   System.out.println("Available Ids are: "); 
//		   for (int i=0; i<id.length; i++){  
//			   System.out.println(id[i]); 
//		   }
		   
		   for(String t:id) {
			   System.out.println(t);
		   }
		}

}
