package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class contains_String_in_String_given_List {

	public static void main(String[] args) {
		
		  List<String> list2 = Arrays.asList("yearly", "years", "yeast", "yellow", "blues", "astra");

	        List filteredList = list2.stream()
	                   .filter(s -> s.length() == 5)
	                    //.filter(s -> !s.startsWith("y"))
	                    .filter(s -> s.startsWith("y"))
	                    .filter(s -> s.contains("years"))
	                    .collect(Collectors.toList());
	        System.out.println(filteredList);
	        
	        
	        List<String> names = Arrays.asList("Melisandre","Aansa","Jon","Daenerys","Joffery");
	        Stream<String> allNames = names.stream();
	        boolean anyRecordStartsWithA = allNames.anyMatch(s-> s.startsWith("A"));
	        
	        System.out.println(anyRecordStartsWithA);
	        
		  
	        List<String> listOfSkills = Arrays.asList("Core Java", "Spring Boot", "Hibernate", "Angular"); 

	        Predicate<String> pred = x -> x.startsWith("S"); 
	        System.out.println(listOfSkills.stream().anyMatch(pred));         // true 
	        System.out.println(listOfSkills.stream().allMatch(pred));         // false 
	        System.out.println(listOfSkills.stream().noneMatch(pred));        // false
	        
	        
	        Stream<String> streamOfSkills = Stream.of("Java", "Scala", "Python", "Spring");
	        streamOfSkills
	           .filter(x -> x.startsWith("S"))
	           .collect(Collectors.toList())     //Collecting the result of a stream into a List
	           .forEach(System.out::println);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
