package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count_Strings_whose_length_is_greater_than_3_in_List {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
    
		long count = stringList.stream().filter(str -> str.length() > 3).count();
    
        System.out.println("String count with greater than 3 digit : " + count);
	
        List<String> list = Arrays.asList("yearly", "years", "yeast", "yellow");

        long count1 = list.stream().filter(s -> s.length() == 5).count();
        System.out.println(String.format("There are %s words of length 5", count1));
        
        
        
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
        Stream<String> allNames = names.stream();
        Stream<String> longNames = allNames.filter(str -> str.length() > 6);
        
        
        List<String> listOfStrings = Arrays.asList("Mark", "Howard", "AnthonyhgjCornian");
        Optional<String> largeString = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
        largeString.ifPresent(System.out::println);
        
        
        
        
        
	}

}
