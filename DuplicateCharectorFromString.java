package com.ei.stringForInterview;
import java.util.*; 

public class DuplicateCharectorFromString 

{   
     public static void main(String[] args)  
     {          
    	 Scanner sc=new Scanner(System.in);   

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

    }   

} 