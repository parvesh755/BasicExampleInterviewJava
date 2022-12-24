package com.ei.ArraysForStreams;

import java.util.Comparator;
import java.util.stream.Stream;

public class find_the_Minimum_number_of_a_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer min = Stream.of(1, 2, 3, 4, 5, 6,7).min(Comparator.comparing(Integer::valueOf)).get();
         System.out.println("The Minimum number is: " + min);
	}

}
