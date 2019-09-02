package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    //private static int flag = 0; // 等等, 放置标识符, 复杂的反射等方式破坏单例.  其实是没用的, 别忘了"映射"都可以修改哦

    //多线程下, 若反射线程先进入, 会导致产生多个 instance, 破坏了单例
    // 解决措施, 放置映射方式破坏懒汉式单例模式
    /*private LazySingleton(){
        if (lazySingleton != null){
            throw new RuntimeException("单例构造器静止反射调用");
        }
    }*/
    public synchronized static LazySingleton getInstance(){ //琐的是类, 开销大
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
