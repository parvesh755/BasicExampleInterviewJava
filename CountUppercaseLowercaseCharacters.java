package com.ei.ArraysForStreams;
import java.util.*; 

public class CountUppercaseLowercaseCharacters 
{ 
    public static void main(String [] args) 
    {     
    	String str; 
       int countUpperCase= 0, countLowerCase= 0, countDigit= 0, countSpace=0; 

         Scanner in = new Scanner(System.in); 
         System.out.printf("Enter the String"); 
          str = in.nextLine(); 
        char ch; 
             for (int i=0;i<str.length();i++) 
             { 
                ch = str.charAt(i);               
                if(Character.isUpperCase(ch))  
                countUpperCase++; 

                      if(Character.isLowerCase(ch)) 
                     countLowerCase++; 

                 if(Character.isDigit(ch)) 
                	 countDigit++; 

                 if(Character.isWhitespace(ch)) 

                     countSpace++; 

             } 

           

            

                System.out.println("Capital Letters: " + countUpperCase); 

                System.out.println("Small Letters: " + countLowerCase); 

                System.out.println("Digit: " + countDigit); 

                System.out.println("Space: " + countSpace); 

                  

           

            

    } 

} 