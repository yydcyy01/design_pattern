package cn.yydcyy.design._3behaviour._5Mediator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Calender extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender(){
        System.out.println("doCalender()");
    }
}
