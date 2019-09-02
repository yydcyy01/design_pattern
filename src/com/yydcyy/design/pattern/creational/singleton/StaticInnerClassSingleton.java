package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 * 对应笔记 ppt P68
 * }
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
     return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
