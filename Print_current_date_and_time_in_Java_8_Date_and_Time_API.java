package com.ei.ArraysForStreams;

public class Print_current_date_and_time_in_Java_8_Date_and_Time_API {

	public static void main(String[] args) {
		
		System.out.println("Current Date: " + java.time.LocalDate.now());
        System.out.println("Current Time: " + java.time.LocalTime.now());
        System.out.println("Current Date and Time: " + java.time.LocalDateTime.now());
	}

}
