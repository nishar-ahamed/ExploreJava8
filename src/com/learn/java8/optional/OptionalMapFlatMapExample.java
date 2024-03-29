package com.learn.java8.optional;

import com.learn.java8.data.Bike;
import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFlatMap() {
        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();
        if (studentOptional.isPresent()) {
            Optional<Bike> bikeOptional = studentOptional.
                    flatMap(Student::getBike); //
            System.out.println("bikeOptional : " + bikeOptional);
        }
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();

        if (studentOptional.isPresent()) {
            Optional<String> nameOptional = studentOptional.
                    map(Student::getName); //
            System.out.println("nameOptional : " + nameOptional);
        }
    }

    public static void optionalFilter() {

        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent()
                .filter(student -> student.getGpa() >= 3.9);

        studentOptional.ifPresent(student -> System.out.println(student));

    }

    public static void main(String[] args) {
        optionalFlatMap();
        optionalMap();
        optionalFilter();
    }
}

