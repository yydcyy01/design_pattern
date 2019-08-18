package com.yydcyy.design.pattern.creational.builder.version_2;

import java.util.Set;

/**
 * Created by YYDCYY on 2019-08-19.
 * 演进版 builderxxx 简单明了, 不易出错.
 * 不需要写多个Construct构造器
 */
public class Test {
    public static void main(String[] args) {
        //链式调用, 很常用的 调用Course的内部CourseBuilder类的多个同级方法.
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式自学").buildCoursePPT("Java设计模式自学PPT").buildCourseVideo("Java设计模式自学视频").build();
        System.out.println(course);

       // Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();

       // System.out.println(set);
    }
}
