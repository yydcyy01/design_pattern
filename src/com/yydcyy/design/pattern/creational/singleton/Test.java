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
         *
         */

        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
