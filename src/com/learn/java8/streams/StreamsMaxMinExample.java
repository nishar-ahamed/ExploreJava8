package com.learn.java8.streams;

import java.util.*;

public class StreamsMaxMinExample {


    public static Optional<Integer> maxValue(List<Integer> integerList) {
        return integerList.stream()
                //.reduce(0,(a,b)->(a>b) ? a : b);
                .reduce(Integer::max);
    }

    public static Optional<Integer> minValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> (a < b) ? a : b);
        //.reduce(0,Integer::min);
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> maxValue = maxValue(integers);
        if (maxValue.isPresent()) {
            System.out.println("Max value is : " + maxValue.get());
        } else {
            System.out.println("List is Empty");
        }

        Optional<Integer> minValue = minValue(integers);
        if (minValue.isPresent()) {
            System.out.println("Min value is : " + minValue.get());
        } else {
            System.out.println("List is Empty");
        }
    }
}
