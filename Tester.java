package com.df.streamExample.comprableAndComprator;

import java.util.ArrayList; 

import java.util.Collections; 

import java.util.Comparator; 

import java.util.List; 

import java.util.stream.Collectors; 

  


  

public class Tester { 

   

public static void main(String[] args) { 

              List<Employee> employees = new ArrayList<>(); 

  

      employees.add(new Employee(1, 20, "A",200000)); 

      employees.add(new Employee(4, 26, "D",70000)); 

      employees.add(new Employee(2, 23, "C",540000)); 

      employees.add(new Employee(3, 25, "B",230000)); 

      employees.add(new Employee(5, 24, "E",150000)); 

  

      //Unordered list 

      System.out.println("Unsorted List"); 

      System.out.println(employees);  

      System.out.println("id sorted....."); 

      IdComparator idsort = new IdComparator(); 

      List<Employee> list2 = employees.stream().sorted(idsort).collect(Collectors.toList()); 

     System.out.println(list2+"this is list"); 

      System.out.println("age sorted...."); 

      AgeComparator  agesort = new AgeComparator(); 

      List<Employee> list1 = employees.stream().sorted(agesort).collect(Collectors.toList()); 

     System.out.println(list1+"this is list"); 

     System.out.println("salary sorted......."); 

     SalaryComparator  sortSalary  = new SalaryComparator(); 

     List<Employee> list3 = employees.stream().sorted(sortSalary).collect(Collectors.toList()); 

     System.out.println(list3+"this is list"); 

             

} 

} 