package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> list) {
        return list.stream()
                .limit(4)
                .reduce((a, b) -> a + b);
    }

    public static Optional<Integer> skip(List<Integer> list) {
        return list.stream()
                .skip(4)
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> limitSum = limit(list);
        if (limitSum.isPresent()) {
            System.out.println("sum after limit is : " + limitSum.get());
        } else {
            System.out.println("List is empty");
        }
        Optional<Integer> skipSum = skip(list);
        if (skipSum.isPresent()) {
            System.out.println("sum after skip is :" + skipSum.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
