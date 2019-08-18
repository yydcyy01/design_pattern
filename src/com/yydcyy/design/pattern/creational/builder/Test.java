package com.yydcyy.design.pattern.creational.builder;

/**
 * Created by YYDCYY on 2019-08-19.
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java 设计模式自学",
                                            "Java设计模式自学笔记 PPT",
                                            "Java设计模式自学视频",
                                            "Java 设计模式自学手记",
                                            "Java 设计模式 QA"); //构造器实现, 不可缺省

        System.out.println(course);
    }
}
