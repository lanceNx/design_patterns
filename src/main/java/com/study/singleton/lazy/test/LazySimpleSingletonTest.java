package com.study.singleton.lazy.test;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();


        System.out.println("Exector END.........");
    }

}

