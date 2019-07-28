package com.learn.java8.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        * creating a runnable prior to java 8
        * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable......");
            }
        };

        new Thread(runnable).start();

        /*
        *
        * creating runnable using lambda
        * () -> {}; //use this syntax if you have multiple statement in body
        * () -> ;   //use this statement if you have single line of statement in body
        *
        * */

        Runnable runnable1 = () -> {System.out.println("inside runnable1......");};
        new Thread(runnable1).start();

        //as the above lambda has only one statement in body than it can be written like below

        Runnable runnable2 = () -> System.out.println("inside runnable2......");
        new Thread(runnable2).start();

        //or

        new Thread(()->System.out.println("inside runnable3......")).start();

    }
}
