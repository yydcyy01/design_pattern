package cn.yydcyy.design._2creation._6Prototype;

/**
 * @author YYDCYY
 * @create 2019-11-24
 *
 * 原型模式涉及"深浅复制"概念,  具体是深复制还是浅复制, 看自己业务逻辑实现
 */
public class ConcretePrototype extends Prototype{

    private String filed;

    /**
     构造器
     */
    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
