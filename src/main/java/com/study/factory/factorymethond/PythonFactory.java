package com.study.factory.factorymethond;

import com.study.factory.ICourse;
import com.study.factory.PythonCourse;

public class PythonFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
