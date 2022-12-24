package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class multiply_3_to_all_element_in_list_and_print_the_list {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(integerList.stream().map(i -> i*3).collect(Collectors.toList()));
		
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
        List<Integer> distinct = numbers.stream() .map( i -> i*i) .distinct() .collect(Collectors.toList());
        System.out.println("Original List :"+ numbers+""+ distinct);

    	}

}
