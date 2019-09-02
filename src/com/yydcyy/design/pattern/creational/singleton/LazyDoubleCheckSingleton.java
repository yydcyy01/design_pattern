package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public  static LazyDoubleCheckSingleton getInstance(){ //琐的是类, 开销大
        if (lazyDoubleCheckSingleton == null) {
            synchronized(LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
