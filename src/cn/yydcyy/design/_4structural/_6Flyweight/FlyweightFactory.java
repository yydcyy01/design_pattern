package cn.yydcyy.design._4structural._6Flyweight;

import java.util.HashMap;

/**
 * @author YYDCYY
 * @create 2019-11-26
 */
public class FlyweightFactory {
    private HashMap<String , Flyweight> flyweights = new HashMap<>();

    // 没有先创建
    Flyweight getFlyweight(){

    }
}
