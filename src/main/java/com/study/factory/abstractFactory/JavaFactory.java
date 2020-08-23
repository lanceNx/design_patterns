package com.study.factory.abstractFactory;

import com.study.factory.ICourse;
import com.study.factory.INote;
import com.study.factory.JavaCourse;
import com.study.factory.JavaNote;

public class JavaFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }
}
