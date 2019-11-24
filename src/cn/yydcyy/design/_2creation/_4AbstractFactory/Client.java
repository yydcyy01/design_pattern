package cn.yydcyy.design._2creation._4AbstractFactory;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();

        // do something with productA and ProductB
    }
}
