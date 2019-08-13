package com.yydcyy.design.principle.singleresponsibility;

/**
 * Created by YYDCYY on 2019-08-13.
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public String getCourseName() {
        // todo SomeThing
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        // todo SomeThing
        return new byte[0];
    }

    @Override
    public void studyCourse() {
        // todo SomeThing
    }

    @Override
    public void refundCourse() {
        // todo SomeThing
    }
}
