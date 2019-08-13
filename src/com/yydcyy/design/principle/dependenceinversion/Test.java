package com.yydcyy.design.principle.dependenceinversion;

/**
 * Created by YYDCYY on 2019-08-13.
 * 依赖倒置原则 Demo
 * 定义 : 高层模块不应该依赖底层模块, 两者都应该依赖其抽象
 * 抽象不应该依赖细节, 细节应该依赖抽象
 * 针对接口编程, 不要针对实现编程

 * 优点: 可以减少类间的耦合性, 提高系统的稳定性, 挺高代码可读性和可维护性, 可降低修改程序所造成的风险
 */
public class Test {

    // V 0.1
    /*public static void main(String[] args) {
        YuYang yuYang = new YuYang();
        yuYang.studyJavaCourse();
        yuYang.studyPythonCourse();
        ..... YuYang类里实现
    }*/

    // V 0.2 设置构造器, 传实例
    /*public static void main(String[] args) {
        YuYang yuYang = new YuYang(new JavaCourse());
        yuYang.studyCourse();
    }*/

    // V 0.3  面向接口编程
        public static void main(String[] args) {
        YuYang yuYang = new YuYang();
        yuYang.setICourse(new JavaCourse());
        yuYang.studyCourse();
        yuYang.setICourse(new PythonCourse());
        yuYang.studyCourse();
    }
}
