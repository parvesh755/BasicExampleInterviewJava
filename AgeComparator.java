package com.df.streamExample.comprableAndComprator;
 import java.util.Comparator; 

 class AgeComparator implements Comparator<Employee> { 

  

public int compare(Employee o1, Employee o2) { 

 

      if (o1.getAge() < o2.getAge()) { 

         

    	  return -1;         

      } 

      else if (o1.getAge() > o2.getAge()) {           

         

    	  return 1; 

      }  

      else { 

          

    	  return 0;         

      }     

   } 

} 

 