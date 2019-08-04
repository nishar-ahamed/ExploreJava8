package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> list) {
        return list.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithNoInitialValue(List<Integer> list) {
        return list.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((student, student2) -> student.getGpa() > student2.getGpa() ? student : student2);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("performMultiplication: " + performMultiplication(list));

        Optional<Integer> optionalInteger = performMultiplicationWithNoInitialValue(list);
        if (optionalInteger.isPresent())
            System.out.println("performMultiplicationWithNoInitialValue: " + optionalInteger.get());

        if (getHighestGPAStudent().isPresent())
            System.out.println("getHighestGPAStudent : " + getHighestGPAStudent().get());
    }
}
