package com.study.singleton.hungry;

/**
 * 饿汉式
 */
public class HungryStataicSingleton {

    //如果不加final的话，有可能别人通过反射机制覆盖
    //如果加了final，这个实例是不可能被改动的
    private static final HungryStataicSingleton hungrySingleton;

    static {//不管是静态的字段，还是静态代码块，都会在类加载的时候立即初始化
        hungrySingleton = new HungryStataicSingleton();
    }

    private HungryStataicSingleton() {}

    public static HungryStataicSingleton getInstance() {
        return hungrySingleton;
    }

}
