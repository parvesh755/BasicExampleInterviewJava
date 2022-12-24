package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class find_the_first_element_of_the_list_using_Stream_functions {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        
		      myList.stream().findFirst().ifPresent(System.out::println);
	}

}
