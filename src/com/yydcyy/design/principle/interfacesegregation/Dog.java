package com.yydcyy.design.principle.interfacesegregation;

/**
 * Created by YYDCYY on 2019-08-13.
 */
public class Dog implements ISwimAnimalAction, IEatAnimalAction{

    @Override
    public void eat() {
        //do sth
    }

    @Override
    public void swim() {
        //do sth
    }
}
