package com.yydcyy.design.principle.singleresponsibility;

/**
 * Created by YYDCYY on 2019-08-13.
 * 不符合单一原则, 既实现 ICourseContent接口职责, 也实现 ICourseManager职责
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse(); //退课
}
