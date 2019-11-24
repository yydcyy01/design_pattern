package com.yydcyy.design.pattern.creational.abstractfactory;

import com.yydcyy.design.principle.demeter.Course;

/**
 * Created by YYDCYY on 2019-08-14.
 * Video  产品等级结构 => PythonVideo / JavaVideo /
 * Article / JavaArticle / PythonArticle
 * CourseFactory 产品族=>
 *          JavaCourseFactory => getVideo() { return new JavaVideo();
 *                               getArticle() { return new JavaArticle();
 *
 *         PythonCourseFactory => getVideo() { return new PythonVideo();
 *                               getArticle() { return new PythonArticle();
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("===================== Java ==========");
        CourseFactory javacourseFactory = new JavaCourseFactory();
        Video video = javacourseFactory.getVideo();
        Article article = javacourseFactory.getArticle();

        video.produce();
        article.produce();
        System.out.println("===================== Python ==========");
        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        Video video2 = pythonCourseFactory.getVideo();  //从工厂获取
        Article article2 = pythonCourseFactory.getArticle();

        video2.produce();
        article2.produce();

    }

    public void test() {

    }

}
