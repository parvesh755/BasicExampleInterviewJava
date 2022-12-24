package com.ei.ArraysForStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class remove_the_duplicate_elements_from_the_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,3);
        System.out.println("After removing duplicates : ");
        integerList.stream().collect(Collectors.toSet()).forEach(System.out::print);
        
        /*------------------------------------------------------------------------------------------------------*/
        
        String string = "cbacdcbc";
        string.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toSet()).forEach(System.out::print);

        
              
        
        
	}

}
