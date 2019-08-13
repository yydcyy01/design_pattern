package com.yydcyy.design.principle.dependenceinversion;

/**
 * Created by YYDCYY on 2019-08-13.
 */
public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("YuYang 正在学习 Java");
    }
}
