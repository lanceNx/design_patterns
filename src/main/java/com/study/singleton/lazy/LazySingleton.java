package com.study.singleton.lazy;

/**
 * 懒汉式
 * 调用的时候再赋值
 * 两个线程同时进入 if (null == lazySingleton) 这个new就执行了两次，正常顺序下，会出现两个内存地址
 * 如果两个线程不是同时进入的话，就是看到一个假象(覆盖)
 * return之前  lazySingleton = new LazySingleton() 的时候，线程1先执行完，线程2后执行完，后面的覆盖了前面的
 * 然后两个线程出去，LazySingleton.getInstance()的时候是同一个内存地址
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
