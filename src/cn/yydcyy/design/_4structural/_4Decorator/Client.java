package cn.yydcyy.design._4structural._4Decorator;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
