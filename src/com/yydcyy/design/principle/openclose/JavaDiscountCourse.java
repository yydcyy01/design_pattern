package com.yydcyy.design.principle.openclose;

/**
 * Created by YYDCYY on 2019-08-13.
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }
}
