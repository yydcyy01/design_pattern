package com.yydcyy.design.principle.singleresponsibility;

/**
 * Created by YYDCYY on 2019-08-13.
 * 定义移动方式
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else{
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
