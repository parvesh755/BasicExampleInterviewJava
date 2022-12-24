package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class program_to_get_the_sum_of_all_numbers_present_in_a_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	       System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());

	}

}
