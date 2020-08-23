package com.study.factory.abstractFactory;

public class AbstarctFactoryTest {

    public static void main(String[] args) {
        //产品链
        ICourseFactory factory = new JavaFactory();

        factory.create();
    }

}
