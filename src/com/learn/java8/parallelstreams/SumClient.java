package com.learn.java8.parallelstreams;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum = new Sum();

        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::performSum); //actual result is : 500500 in serial but varies when use parallel

        System.out.println(sum.getTotal());
    }
}
