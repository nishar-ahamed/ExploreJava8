package com.learn.java8.streamsterminal;


import java.util.stream.Collectors;

import com.learn.java8.data.StudentDataBase;

public class StreamsCountingExample {

    public static long count(){
       return  StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
