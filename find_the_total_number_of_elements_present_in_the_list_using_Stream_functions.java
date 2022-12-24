package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class find_the_total_number_of_elements_present_in_the_list_using_Stream_functions {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count =  myList.stream().count();
        System.out.println(count);                    

	}

}
