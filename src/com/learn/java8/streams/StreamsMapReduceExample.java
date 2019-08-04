package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Arrays;

public class StreamsMapReduceExample {

    public static int numberOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() > 2)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0, (a, b) -> a + b)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("numberOfNoteBooks: " + numberOfNoteBooks());
    }
}
