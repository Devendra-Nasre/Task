package Day1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Test_Student {

	public static void main(String[] args)
	{

//		1. WAP to print list of all students who’s total marks are less than 40%	
		List<Student> lStudent=new LinkedList<>();
		lStudent.add(new Student(101, LocalDateTime.of(LocalDate.of(2021, 07, 18), LocalTime.of(10, 05)), LocalDateTime.of(LocalDate.of(1995, 07, 18), LocalTime.of(10, 50)), "75", "45", "54", "76", "85", "A"));
		lStudent.add(new Student(102, LocalDateTime.of(LocalDate.of(2020, 07, 18), LocalTime.of(10, 05)), LocalDateTime.of(LocalDate.of(1996, 07, 18), LocalTime.of(10, 50)), "32", "35", "33", "36", "31", "A"));
		lStudent.add(new Student(103, LocalDateTime.of(LocalDate.of(2022, 07, 18), LocalTime.of(10, 05)), LocalDateTime.of(LocalDate.of(1994, 07, 18), LocalTime.of(10, 50)), "75", "45", "54", "76", "85", "A"));
		
//		lStudent.stream().filter(null)
		
	}
	
}
