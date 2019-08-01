package com.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

public class StreamFlatMapExample {
    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(Collectors.toList());

        return studentActivities;

    }
    
    public static List<String> printDistinctStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .distinct()
                .collect(Collectors.toList());

        return studentActivities;

    }
    
    public static void main(String args[]) {
		System.out.println("printStudentActivities: " + printStudentActivities());
		System.out.println("printDistinctStudentActivities: " + printDistinctStudentActivities());
	}
}
