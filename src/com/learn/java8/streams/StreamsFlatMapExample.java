package com.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

public class StreamsFlatMapExample {
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
    
    public static long getStudentActivitiesCount() {

        long totalActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;

    }
    
    public static void main(String args[]) {
		System.out.println("printStudentActivities: " + printStudentActivities());
		System.out.println("printDistinctStudentActivities: " + printDistinctStudentActivities());
		System.out.println("getStudentActivitiesCount: " + getStudentActivitiesCount());
	}
}
