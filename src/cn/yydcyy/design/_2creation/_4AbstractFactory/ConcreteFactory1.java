package cn.yydcyy.design._2creation._4AbstractFactory;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
