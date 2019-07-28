package com.learn.java8.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*
        * prior to java 8
        */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };

        System.out.println("Result : "+comparator.compare(2,1));

        /*
        * Using lambda
        * */

        Comparator<Integer> comparator1 = (Integer a, Integer b) -> {return a.compareTo(b); };
        System.out.println("Result : "+comparator1.compare(2,1));

        //or

        Comparator<Integer> comparator2 = (Integer a, Integer b) -> a.compareTo(b); //no need to provide return keyword if single statement
        System.out.println("Result : "+comparator2.compare(2,1));

        //or

        Comparator<Integer> comparator3 = (a, b) -> a.compareTo(b); //no need to provide arguments type as lambda is smart enough to cast arguments
        System.out.println("Result : "+comparator3.compare(2,1));

    }
}
