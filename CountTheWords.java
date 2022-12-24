package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CountTheWords
{
    public static void main(String[] args)
    {

    	
    	List <String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
    	
    	Map<String,Long> collect = wordsList.stream()
    		    .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ));
    	
    	System.out.println(collect);
    	
    	
 
        String  s = "this is is  my first string";
        int count = 1;
 
        for (int i = 0; i < s.length()-1; i++)
        {
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
 
        System.out.println("Number of words in a string = "+count);
 
    	
}
}