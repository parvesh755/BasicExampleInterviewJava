package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class program_to_perfrom_cube_on_list_elements_and_filter_numbers_greater_than_50 {

	public static void main(String[] args) {
		
		 List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	       integerList.stream().map(i -> i*i*i).filter(i -> i>50).forEach(System.out::println);
	}

}
