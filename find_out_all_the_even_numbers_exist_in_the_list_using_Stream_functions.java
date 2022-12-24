package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class find_out_all_the_even_numbers_exist_in_the_list_using_Stream_functions {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
         myList.stream().filter(n -> n%2 == 0).forEach(System.out::println);

         Optional firstEvenNumber = Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 3)
                 .filter(n -> n % 2 == 0)
                 .findFirst();
System.out.println(firstEvenNumber);


Optional firstNumberDivisibleBy5 = Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 10, 3,20)
.filter(n -> n > 10)             
.filter(n -> n % 5 == 0)    //empty stream in this line
.findFirst();
System.out.println(firstNumberDivisibleBy5); 





		
		
	}

}
