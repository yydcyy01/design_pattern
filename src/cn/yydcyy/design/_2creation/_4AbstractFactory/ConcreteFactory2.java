package cn.yydcyy.design._2creation._4AbstractFactory;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
