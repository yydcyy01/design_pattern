package cn.yydcyy.design._4structural._4Decorator;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class DarkRoast implements Beverage {
    /**
     * 基础价格
     * @return
     */
    @Override
    public double cost() {
        return 1;
    }
}
