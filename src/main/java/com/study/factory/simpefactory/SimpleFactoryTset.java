package com.study.factory.simpefactory;

import com.study.factory.ICourse;
import com.study.factory.PythonCourse;

public class SimpleFactoryTset {


    public static void main(String[] args) throws Exception {

//        ICourse javaCourse = new JavaCourse();
//        javaCourse.study();
//        ICourse pythonCourse = new PythonCourse();
//        pythonCourse.study();

        //每来一个课程都要new一个新的实现类 封装成工厂模式
        ICourse iCourse = CourseFactory.newCourse1("Java");
        iCourse.study();

        //这个courseName可能会输入错,可能会导致create出来一个null对象
        ICourse newCourse2 = CourseFactory.newCourse2(PythonCourse.class);
        newCourse2.study();

    }


}
