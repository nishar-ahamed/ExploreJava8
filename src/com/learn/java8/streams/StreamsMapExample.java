package com.learn.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.TooManyListenersException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

public class StreamsMapExample {
	
	public static List<String> getListOfStudentNames(List<Student> students) {
		List<String> list = students.stream() //Stream<Student>
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) // Stream<String> -> UpperCase
				.collect(Collectors.toList()); // returns List // terminal operation
		return list;
	}
	
	public static Set<String> getSetOfStudentNames(List<Student> students) {
		Set<String> set = students.stream() //Stream<Student>
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) // Stream<String> -> UpperCase
				.collect(Collectors.toSet()); // returns List // terminal operation
		return set;
	}
	
	public static void main(String args[]) {
		System.out.println("ListOfStudentNames: " + getListOfStudentNames(StudentDataBase.getAllStudents()));
		System.out.println("SetOfStudentNames: " + getSetOfStudentNames(StudentDataBase.getAllStudents()));
	}
}
