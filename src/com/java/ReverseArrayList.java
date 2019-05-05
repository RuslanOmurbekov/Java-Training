package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		
		List list= new ArrayList();
		list.add("Ruslan");
		list.add("Maks");
		list.add("Andrew");
		list.add("Zach");
		list.add("Hilary");
		
		System.out.println("Printing before reverse: ");
		
		System.out.println(list);
		
		/*Collections.reverse(list);
		
		System.out.println("Printing after reverse: ");
		System.out.println(list);*/
		
		String temp="";
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}


	}

}
