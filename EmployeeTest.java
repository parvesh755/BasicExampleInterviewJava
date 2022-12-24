package com.ei.ArraysForStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
List<Employee> employeeList = new ArrayList<Employee>(); 	
		

  Employee employee1 = new Employee(1, "parvesh", 30, "male", "IT", 2017, 70000);
  Employee employee2 = new Employee(2, "denesh", 20, "male", "HR", 2020, 90000);
  Employee employee3 = new Employee(3, "amit", 25, "male", "finence", 2015, 40000);
  Employee employee4 = new Employee(4, "shalu", 27, "female", "develeper", 2010, 30000);
  Employee employee5 = new Employee(5, "sultana", 28, "female", "teacher", 2019, 10000);
      
    		  
  employeeList.add(employee1);
  employeeList.add(employee2);
  employeeList.add(employee3);
  employeeList.add(employee4);
  employeeList.add(employee5);
  
  
  
  Map<String, Long> employeeCountByDepartment = employeeList.stream().collect
		  (Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

  System.out.println(employeeCountByDepartment);

  
  Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=employeeList.stream().collect
		  (Collectors.groupingBy(Employee::getGender, 
				  Collectors.averagingDouble(Employee::getSalary)));

  
  System.out.println(avgSalaryOfMaleAndFemaleEmployees);
  
  
  Optional<Employee> highestPaidEmployeeWrapper=
		  employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(
				  Employee::getSalary)));

  System.out.println(highestPaidEmployeeWrapper);
  
  
  Map<String, Double> avgAgeOfEachDepartment =
          employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
        		  Collectors.averagingInt(Employee::getAge)));

  
  System.out.println(avgAgeOfEachDepartment);
  
  
  Optional<Employee> seniorMostEmployeeWrapper=
		  employeeList.stream().sorted(Comparator.comparingInt(
				  Employee::getYearOfJoining)).findFirst();
  
  
  System.out.println(seniorMostEmployeeWrapper);
  
  
  Optional<Employee> youngestEmployee =
          employeeList.stream().min(Comparator.comparingInt(Employee::getAge));
  
  System.out.println(youngestEmployee);
  
  
  Map<String, Long> employeeCountByDepartments=
		  employeeList.stream().collect(Collectors.groupingBy(
				  Employee::getDepartment, Collectors.counting()));

  System.out.println(employeeCountByDepartments);
  
  
  
  Map<String, Long> noOfMaleAndFemaleEmployees=
		  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
				  Collectors.counting()));

  
  System.out.println(noOfMaleAndFemaleEmployees);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
				
}

}
