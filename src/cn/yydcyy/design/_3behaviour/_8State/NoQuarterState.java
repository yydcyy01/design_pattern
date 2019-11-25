package cn.yydcyy.design._3behaviour._8State;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    //构造器
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 没币状态中, 投币 变成有币状态
     */
    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter...");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have't insert a quarter ...");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter...");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first...");
    }
}
