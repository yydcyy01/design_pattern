package com.yydcyy.design.pattern.creational.abstractfactory;

/**
 * Created by YYDCYY on 2019-08-19.
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }


    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
