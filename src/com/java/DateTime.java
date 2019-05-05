package com.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		
		Date date= new Date();
		System.out.println("Today's Date is "+date);
		
		SimpleDateFormat date1= new SimpleDateFormat("yyyy/mm/dd");
		System.out.println(date1.format(date));
		
		

	}

}
