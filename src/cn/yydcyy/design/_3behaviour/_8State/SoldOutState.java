package cn.yydcyy.design._3behaviour._8State;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    //构造器
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter , the machine is sold out ");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you have't inserted a quarter yet ");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned , but there are no gumballs ");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
