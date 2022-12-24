package com.ei.ArraysForStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StudentTest {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>(); 	
		
		Student student1 = new Student( "Jayesh",12,"sgdf",60);
		Student student2 = new Student( "parvesh",23,"math",70);
		Student student3 = new Student( "kumar",54,"english",80);
		Student student4 = new Student( "amit",70,"hindi",40);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));

		System.out.println(studentspartionedByPercentage);
		
		
		
		List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());

		System.out.println(top3Students);
		
		
		Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));

		System.out.println(namePercentageMap);
		
		
		
		Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		
		System.out.println(subjects);
		
		
		
		
		DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        
		System.out.println("Highest Percentage : "+studentStats.getMax());
		          
		System.out.println("Lowest Percentage : "+studentStats.getMin());
		          
		System.out.println("Average Percentage : "+studentStats.getAverage());

		
		Long studentCount = studentList.stream().collect(Collectors.counting());
		
		System.out.println(studentCount);
		
		
		
		Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));

		System.out.println(studentsGroupedBySubject);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
