package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_duplicate_elements_in_a_given_integers_list_in_java_using_Stream_functions {

	public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          Set<Integer> set = new HashSet();
          myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}

}