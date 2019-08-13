package com.yydcyy.design.principle.dependenceinversion;

/**
 * Created by YYDCYY on 2019-08-13.
 * 这是一个对象类
 */
public class YuYang {
    private ICourse iCourse; //

    public void setICourse(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }
}
