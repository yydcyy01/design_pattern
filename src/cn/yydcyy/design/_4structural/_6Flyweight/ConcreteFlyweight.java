package cn.yydcyy.design._4structural._6Flyweight;

import cn.yydcyy.design._3behaviour._4Iterator.ConcreteAggregate;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;//内在状态

    // 构造器
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address : " + System.identityHashCode(this));
        System.out.println("IntrinsicState : " + intrinsicState);
        System.out.println("ExtrinsicState : " + extrinsicState);
    }
}
