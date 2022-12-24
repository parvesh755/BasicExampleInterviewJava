package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;

public class Print_Strings_whose_length_is_greater_than_3_in_List {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        stringList.stream().filter(str -> str.length() > 3).forEach(System.out::println);

        // TODO Auto-generated method stub

	}

}
