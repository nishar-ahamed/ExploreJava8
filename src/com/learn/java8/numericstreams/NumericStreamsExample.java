package com.learn.java8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNumbers(List<Integer> list) {
        return list.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public static int sumOfNumberIntStream() {
        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("sumOfNumbers : " + sumOfNumbers(list));
        System.out.println("sumOfNumberIntStream : " + sumOfNumberIntStream());

    }
}
