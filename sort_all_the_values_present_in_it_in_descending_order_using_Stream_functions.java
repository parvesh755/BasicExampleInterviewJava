package com.ei.ArraysForStreams;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_all_the_values_present_in_it_in_descending_order_using_Stream_functions {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

		 myList.stream().sorted().forEach(System.out::println);
		 
		 System.out.println(myList);
		
		 System.out.println("--------------------------------------------------");
		 System.out.println(myList.get(0));
		 System.out.println(myList.get(1));

		 System.out.println(myList.get(2));
		 System.out.println(myList.get(3));
         myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
             
	}
	
}
