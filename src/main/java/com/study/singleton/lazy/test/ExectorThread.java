package com.study.singleton.lazy.test;

import com.study.singleton.lazy.LazySingleton;

public class ExectorThread implements Runnable {


    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
