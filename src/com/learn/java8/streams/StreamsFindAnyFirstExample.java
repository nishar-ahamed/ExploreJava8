package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirst() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> findAnyStudent = findAny();
        if (findAnyStudent.isPresent()) {
            System.out.println("Student is :" + findAnyStudent.get());
        } else {
            System.out.println("No Student Found");
        }

        Optional<Student> findFirst = findFirst(); //it will make a lot of different during parallel stream
        if (findFirst.isPresent()) {
            System.out.println("Student is :" + findFirst.get());
        } else {
            System.out.println("No Student Found");
        }
    }
}
