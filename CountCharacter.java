package com.ei.ArraysForStreams;
public class CountCharacter    
{    
    public static void main(String[] args) {    
    	
        String string = "The best of hboth worlds";    
        
        long totalCharacters = string.chars().filter(ch -> ch != ' ').count();
        
         System.out.println(totalCharacters);
         
        
        /*int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
        
        	if(string.charAt(i) != ' ')    
            
        		count++;    
        }*/    
            
         //System.out.println("Total number of characters in a string: " + count);    
    }    
}     