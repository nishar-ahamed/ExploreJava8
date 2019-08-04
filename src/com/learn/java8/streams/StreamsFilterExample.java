package com.learn.java8.streams;

import com.learn.java8.data.StudentDataBase;
import com.learn.java8.data.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGender().equals("female"))
                .filter(s -> s.getGpa() >3.5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
