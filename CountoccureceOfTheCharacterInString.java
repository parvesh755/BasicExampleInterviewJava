package com.ei.ArraysForStreams;

import java.util.Map;
import java.util.stream.Collectors;

public class CountoccureceOfTheCharacterInString { 
        public static void main(String[] args) {
        
        	 String str = "parvespppppaaaaaarrrrrvvvvvveeeeeehhfjgjgjhgjh";

        	    Map<Character,Long> hm = str.chars().mapToObj(c-> 
        	    (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        	    
        	    System.out.println(hm);
        	
        	    
        	
        	
    		   /* String str = "parvespppppaaaaaarrrrrvvvvvveeeeeehhfjgjgjhgjh"; 
           
    		    char[] ch = str.toCharArray(); 
                
                for (int i = 0; i < ch.length; i++) { 
                int count = 0; 
                char c=str.charAt(i); 
                
                for (int j = 0; j < ch.length; j++) { 
                if (c==ch[j]){ 
        		count++; 
		    		ch[j]=0;
		    		} }
                
    		    if(count>0) 
                 System.out.println(c+"="+count); 
    		 } */ 
        	
        
        
        
        
        } } 