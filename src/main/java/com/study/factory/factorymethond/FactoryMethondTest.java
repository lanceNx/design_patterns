package com.study.factory.factorymethond;

public class FactoryMethondTest {
    public static void main(String[] args) {
        
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.create().study();

    }

}
