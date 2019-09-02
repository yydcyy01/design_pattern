package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance(){ //琐的是类, 开销大
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
