package com.learn.java8.functionalinterfaces;

import java.util.function.Consumer;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;


public class ConsumerExample {

    static Consumer<Student> c1 = student -> System.out.println(student);

    static Consumer<Student> c2 = student -> System.out.print(student.getName().toUpperCase());

    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());


    public static void printName() {
        System.out.println("printName : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
        System.out.println();
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3));
        System.out.println();
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() > 3.9) {
                c2.andThen(c3).accept(student);
            }
        });
        System.out.println();
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java8");

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }
}

