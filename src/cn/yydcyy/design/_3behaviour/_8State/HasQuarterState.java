package cn.yydcyy.design._3behaviour._8State;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 有币状态
 */
public class HasQuarterState implements State{

    private GumballMachine gumballMachine;
    // 构造器
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You con't insert another quarter..  because it has a quarter");
    }

    /**
     * 有币状态中, 退币变成无币状态
     */
    @Override
    public void ejectQuarter() {
        System.out.println("You turned....");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    /**
     *  有币状态中, 转钮变销售状态
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned....");
        gumballMachine.setState(gumballMachine.getSoldStates());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
