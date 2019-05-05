package com.java;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupElementsFromArray {

	public static void main(String[] args) {
		
        List<Integer> list= new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(3);
         
         Set<Integer> set= new HashSet<>();
         set.addAll(list);
         System.out.println(set);
	}

}
