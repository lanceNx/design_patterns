package com.study.factory.abstractFactory;

import com.study.factory.ICourse;
import com.study.factory.INote;


//违背了开闭原则
public interface ICourseFactory {

    ICourse create();

    INote createNote();

}
