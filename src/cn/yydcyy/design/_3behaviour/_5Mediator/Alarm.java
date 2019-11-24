package cn.yydcyy.design._3behaviour._5Mediator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Alarm extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm(){
        System.out.println("doAlarm()");
    }
}
