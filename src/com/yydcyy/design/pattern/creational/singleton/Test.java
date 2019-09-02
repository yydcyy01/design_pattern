package com.yydcyy.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author YYDCYY
 * @create 2019-09-02
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /**
         * 1  多线程 debug , 手动分别让 t1, t2 进入 if() 破坏单例, 导致单例失败,创建多个
         */
      /*  Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");*/


        /**
         * 单例模式被破坏的几种情况测试及处理:
         * 2 序列化破坏单例 : 继承 Serializable后, 输出 instance 和 序列化在反序列化实例 newInstance 不一致
         * 解决 : 对应类(Test), 不仅需要继承 Serializable , 覆写此readResolve方法, 可以避免序列化破坏单例模式情况.  注意默认是 returnsuper(); 改为 return singleton
         */
        /*HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        /**
         *演示 饿汉式, 在反射强入情况, 被破坏
         */
        /*Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        //Exception in thread "main" java.lang.IllegalAccessException: Class com.yydcyy.design.pattern.creational.singleton.Test can not access a member of class com.yydcyy.design.pattern.creational.singleton.HungrySingleton with modifiers "private"
        //	at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)

        //private , 通过反射强制进入
        constructor.setAccessible(true);

        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/
        /**  此时 显示结果
         com.yydcyy.design.pattern.creational.singleton.HungrySingleton@2503dbd3
         com.yydcyy.design.pattern.creational.singleton.HungrySingleton@4b67cf4d
         false
          单例模式被破坏了,  解决方法 : 空参构造中,
         * if (hungrySingleton != null){
         *             throw new RuntimeException("单例构造器禁止反射调用");
         *         }
         */


/**
 *      测试 EnumInstance
 */
        EnumInstance instance = EnumInstance.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

        /**
         * 输出 直接
         * INSTANCE
         * INSTANCE
         * true
         */

    }
}
