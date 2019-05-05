package com.java;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {
       int c=0;
	public static void main(String[] args){
		String myName=DynamicCalculator.getMyFullName("Ruslan"," "+ "Omurbekov");
		System.out.println(myName);
	  DynamicCalculator obj= new DynamicCalculator();
	 double result= obj.Addition(23, 12);
	  System.out.println(result);
	  double sub=obj.Substraction(100, 50);
	  System.out.println(sub);
	  
	}
	
	
}
