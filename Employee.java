package com.df.streamExample.comprableAndComprator;

class Employee implements Comparable<Employee> { 

  
   private int id; 

   private int age; 

   private String name; 

   private float salary; 

  

   public Employee(int id, int age, String name,float salary) { 

      this.id = id; 

      this.age = age; 

      this.name = name; 

      this.salary = salary; 

   } 

  

    

  

   @Override 

   public int compareTo(Employee o) { 

       return (this.id - o.id); 

   } 

    

  

   @Override 

public String toString() { 

return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]"; 

} 

  

public float getSalary() { 

return salary; 

} 

 public void setSalary(float salary) { 

this.salary = salary; 

} 

 public int getId() { 

      return id; 

   } 

  public void setId(int id) { 

      this.id = id; 

   } 

   public int getAge() { 

      return age; 

   } 

  

   public void setAge(int age) { 

      this.age = age; 

   } 

  

   public String getName() { 

      return name; 

   } 

  

   public void setName(String name) { 

      this.name = name; 

   } 

} 

 

 