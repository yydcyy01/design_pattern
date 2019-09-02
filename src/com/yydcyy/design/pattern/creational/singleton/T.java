package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 */
public class T implements Runnable{

    @Override
    public void run() {
       // LazySingleton instance = LazySingleton.getInstance();
        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance =  StaticInnerClassSingleton.getInstance(); // 测试 StaticInnerClassSingleton 单例模式

        System.out.println(Thread.currentThread().getName() + "  "+ instance);
    }
}
