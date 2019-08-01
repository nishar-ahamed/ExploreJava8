package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        Stream<String> namesStream = names.stream();

        namesStream.forEach(System.out::println);
        namesStream.forEach(System.out::println);	//will throw exception at this point

    }
}
