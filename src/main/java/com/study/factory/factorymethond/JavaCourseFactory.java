package com.study.factory.factorymethond;

import com.study.factory.ICourse;
import com.study.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
