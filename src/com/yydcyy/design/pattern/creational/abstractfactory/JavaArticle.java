package com.yydcyy.design.pattern.creational.abstractfactory;

/**
 * Created by YYDCYY on 2019-08-19.
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("实现 Java 手记");
    }
}
