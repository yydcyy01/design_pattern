package com.yydcyy.design.pattern.creational.simplefactory;

/**
 * Created by YYDCYY on 2019-08-14.
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("我是 Python 视频");
    }
}
