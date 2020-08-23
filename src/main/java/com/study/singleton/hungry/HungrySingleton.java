package com.study.singleton.hungry;

/**
 * 饿汉式
 * 缺点：不管是否使用，都进行初始化，浪费内存空间
 * 如果量大会消耗大量资源
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
