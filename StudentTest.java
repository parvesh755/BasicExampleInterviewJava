package hashcodeAndEquals.co;
import java.util.HashMap; 

import java.util.Map; 

  

public class StudentTest { 

  

public static void main(String[] args) { 

Student s1 = new Student(1); 

Student s2 = new Student(1); 

             System.out.println(s1.equals(s2)); 

 

System.out.println("s1 hashcode"+s1.hashCode());  // hashcode must be same 

System.out.println("s2 hashcode"+s2.hashCode()); 

 

   //	Student s2 = new Student(2); //2  if object are not equal 

System.out.println(s1.equals(s2)); 

System.out.println("s1 hashcode"+s1.hashCode()); 

System.out.println("s2 hashcode"+s2.hashCode()); 

 

 

      //	hashcode are same  equal method mey be true or false 

 

        System.out.println(s1.equals(s2)); 

 

System.out.println("s1 hashcode"+s1.hashCode()); 

System.out.println("s2 hashcode"+s2.hashCode()); 

 

   //	hashcode are not same  equal method always false false 

 

        System.out.println(s1.equals(s2)); 

 

System.out.println("s1 hashcode"+s1.hashCode()); 

System.out.println("s2 hashcode"+s2.hashCode()); 

 

           Map<Student,String> map = new HashMap<Student,String>(); 

map.put(s1,"parvesh"); 

map.put(s2,"parvesh"); 

 

System.out.println(map); 

} 

} 

 