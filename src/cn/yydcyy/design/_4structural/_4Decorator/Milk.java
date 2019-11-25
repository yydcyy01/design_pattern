package cn.yydcyy.design._4structural._4Decorator;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
