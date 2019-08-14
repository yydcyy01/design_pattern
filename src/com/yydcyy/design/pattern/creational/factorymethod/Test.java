package com.yydcyy.design.pattern.creational.factorymethod;

/**
 * Created by YYDCYY on 2019-08-14.
 * 方法全复制 simpleFactory方法, 然后 把Video
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonFactory();
        VideoFactory videoFactory2 = new FEVideoFactory();
        VideoFactory videoFactory3 = new JavaVideoFactory();
        Video video = videoFactory.getVideo(); //多态
        video.produce();
    }
}
