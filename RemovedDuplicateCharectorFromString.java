package com.df.streamExample.comprableAndComprator;
import java.util.*;
import java.util.stream.Collectors; 

public class RemovedDuplicateCharectorFromString 

{   
     public static void main(String[] args)  
     {      

    	 List<String> list = new ArrayList(Arrays.asList("a","a","a","b"));

    	// List<String> list = new ArrayList(Arrays.asList("A", "B", "C", "D", "A", "B", "C", "A", "F", "C"));
    	
    	 
	     List<String> distinctElementList2 = list.stream().distinct().collect(Collectors.toList());
    	 
    	 System.out.println(distinctElementList2);
    	 
    	 /*-----------------------------------------------------------------------------------------------------------------------*/
    	 
    	 String string = "cbacdcbc";
    	    
    	 string.chars().mapToObj(item -> (char) item)
    	            .collect(Collectors.toSet()).forEach(System.out::print);

    	 
    	 /*Scanner sc=new Scanner(System.in);   

        System.out.println("Enter the string is: "); 

        String str1=sc.nextLine(); 

        int count;   
       char str[] = str1.toCharArray();             

        for(int i = 0; i <str.length; i++)  
        {   
            count = 1;   
            for(int j = i+1; j <str.length; j++)  
            {   
                if(str[i] == str[j] && str[i] != 0)  

                {   
                    count++;   
                    str[j] = 0;   
                }   
            }                

            if(count > 1 && str[i] != 0)   

            	System.out.println(str[i]);   

        }   
*/
    }   

} 