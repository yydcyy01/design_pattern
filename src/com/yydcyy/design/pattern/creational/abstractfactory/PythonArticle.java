package com.yydcyy.design.pattern.creational.abstractfactory;

/**
 * Created by YYDCYY on 2019-08-19.
 */
public class PythonArticle extends Article{

    @Override
    public void produce() {
        System.out.println(" 实现 Python 手记");
    }
}
