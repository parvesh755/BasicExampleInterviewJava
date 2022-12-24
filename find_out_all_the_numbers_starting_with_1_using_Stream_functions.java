package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class find_out_all_the_numbers_starting_with_1_using_Stream_functions {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
         myList.stream()
               .map(s -> s + "") // Convert integer to String
               .filter(s -> s.startsWith("1"))
               .forEach(System.out::println);
	}

}
