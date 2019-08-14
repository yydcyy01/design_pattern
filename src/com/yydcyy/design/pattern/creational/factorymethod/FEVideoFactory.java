package com.yydcyy.design.pattern.creational.factorymethod;

/**
 * Created by YYDCYY on 2019-08-14.
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
