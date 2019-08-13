package com.yydcyy.design.principle.singleresponsibility;

/**
 * Created by YYDCYY on 2019-08-13.
 * 该接口符合单一职责原则
 */
public interface ICourseContent {
    String getCourseName(); //获取课程名
    byte[] getCourseVideo(); //获取课程视频流
}
