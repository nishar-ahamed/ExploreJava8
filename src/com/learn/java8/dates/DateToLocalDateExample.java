package com.learn.java8.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

    public static void main(String[] args) {

        /**
         *  java.util.Date to LocalDate and vice versa
         */

        Date date = new Date();
        System.out.println("converted Local Date : " + date.toInstant().atZone(ZoneId.of("America/Chicago")).toLocalDate());

        LocalDate localDate = LocalDate.now();
        Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("java.util.dates is : " + date1);


        /**
         *  LocalDate to java.sql.Date
         */

        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("java.sql.dates is : " + date2);


        LocalDate localDate2 = date2.toLocalDate();
        System.out.println("converted Local Date : " + localDate2);

    }
}

