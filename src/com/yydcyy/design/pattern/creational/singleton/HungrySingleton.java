package com.yydcyy.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author YYDCYY
 * @create 2019-09-02
 * 破坏单例方式之一 : cloneable
 * 解决方法 : 覆写 clone(),  return getInstance;  // 而不是使用默认的 return  super.clone();
 *
 * 恶汉式, 一开始就初始化的单例模式, 利用静态代码块 static{} 实现
 */
public class HungrySingleton implements Serializable/*, Cloneable */ {
    private final static HungrySingleton hungrySingleton ;//new HungrySingleton(); // 若想利用静态代码块实现初始化, 就不可以在写 new 了.

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        // 以下为解决映射方式构造类, 破坏单例模式方法
        if (hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
        // ......
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //覆写此方法, 可以避免序列化破坏单例模式情况.  注意默认是 returnsuper(); 改为 return singleton
    private Object readResolve(){
        return hungrySingleton;
    }

   /* @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();  // 使用这个默认的, 多线程可能出破坏单例情况
        return getInstance();   // 可以避免这个错误
    }*/


}
