package com.df.streamExample.comprableAndComprator;
import java.util.ArrayList; 

import java.util.Comparator; 

import java.util.List; 

import java.util.stream.Collectors; 

  

public class SortingByComprator { 

  

public static void main(String[] args) { 

 

List<String> list = new ArrayList<String>(); 

list.add("parvesh"); 

list.add("amit"); 

list.add("chaman"); 

list.add("kumar"); 

 

       List<String> list2 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()); 

System.out.println(list2); 

        

List<String> list3 = list.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList()); 

 System.out.println(list3); 

 

} 

} 

 