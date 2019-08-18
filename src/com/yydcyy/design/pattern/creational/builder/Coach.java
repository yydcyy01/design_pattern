package com.yydcyy.design.pattern.creational.builder;

/**
 * Created by YYDCYY on 2019-08-19.
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                            String courseQA ){

        this.courseBuilder.buildCourseName( courseName );
        this.courseBuilder.buildCoursePPT( coursePPT );
        this.courseBuilder.buildCourseVideo( courseVideo );
        this.courseBuilder.buildCourseArticle( courseArticle );
        this.courseBuilder.buildCourseQA( courseQA );

        return this.courseBuilder.makeCourse();
    }
}
