package com.learn.java8.parallelstreams;

public class Sum {

    private int total;
    private Object lock = new Object();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input) {
        total += input;
    }

}
