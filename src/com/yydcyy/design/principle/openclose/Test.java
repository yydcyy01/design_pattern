package com.yydcyy.design.principle.openclose;

/**
 * Created by YYDCYY on 2019-08-13.
 * 开闭原则 :
 * 定义 : 一个软件应该对扩展开放, 对其修改关闭
 * 用抽象类构建框架, 用事先扩展细节
 *
 * 优点 : 提高软件系统的可复用性及维护性
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(101,"JavaCourse Demo" , 123d);
        // System.out中有锁, 企业开发中不会用的而用log
        System.out.println("课程ID: " + javaCourse.getId() + "  课程名称 : " + javaCourse.getName() + "  课程价格 : " + javaCourse.getPrice());
    }
}
