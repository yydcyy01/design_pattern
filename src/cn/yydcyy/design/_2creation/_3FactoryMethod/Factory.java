package cn.yydcyy.design._2creation._3FactoryMethod;

import cn.yydcyy.design._2creation._2SimpleFactory.Product;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething(){
        Product product = factoryMethod();
        //do something with the product
    }
}
