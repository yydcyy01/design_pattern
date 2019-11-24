package cn.yydcyy.design._3behaviour._5Mediator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class CoffeePot extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot(){
        System.out.println("doCoffeePot()");
    }
}
