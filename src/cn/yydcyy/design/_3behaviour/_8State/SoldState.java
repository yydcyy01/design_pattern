package cn.yydcyy.design._3behaviour._8State;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class SoldState implements State{

    GumballMachine gumballMachine;

    //构造器
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait , we're alreadygiving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry , you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball! ");
    }

    @Override
    public void dispense() {
        //出货
        gumballMachine.releaseBall();

        //更新状态
        if (gumballMachine.getCount() > 0) {
            //有货, 更新到没币状态
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            //没货, 更新到缺货状态
            System.out.println("Oops , out of gumballs ");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
