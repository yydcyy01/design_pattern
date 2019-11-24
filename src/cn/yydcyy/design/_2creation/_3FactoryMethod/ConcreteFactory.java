package cn.yydcyy.design._2creation._3FactoryMethod;

import cn.yydcyy.design._2creation._2SimpleFactory.ConcreteProduct;
import cn.yydcyy.design._2creation._2SimpleFactory.Product;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
