package com.study.factory.simpefactory;

import com.study.factory.ICourse;
import com.study.factory.JavaCourse;
import com.study.factory.PythonCourse;

public class CourseFactory {

    /**
     * 最原始的
     */
    public static ICourse newCourse1(String courseName) {

        if ("Java".equals(courseName)) {
            return new JavaCourse();
        } else if ("Python".equals(courseName)) {
            return new PythonCourse();
        }
        return null;
    }


    /**
     * 改进的，根据class来创建
     */
    public static ICourse newCourse2(Class clazz) throws Exception {
        if(null == clazz) {
            return null;
        }
        return (ICourse) clazz.newInstance();
    }

}
