package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class find_the_maximum_value_element_present_in_it_using_Stream_functions {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         
		 int max =  myList.stream().max(Integer::compare).get();
         
         System.out.println(max);     
	}

}
