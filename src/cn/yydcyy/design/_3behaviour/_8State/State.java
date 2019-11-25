package cn.yydcyy.design._3behaviour._8State;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public interface State {

    /**
     * 投入 5 分钱
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
