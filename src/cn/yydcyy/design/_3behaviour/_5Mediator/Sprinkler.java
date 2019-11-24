package cn.yydcyy.design._3behaviour._5Mediator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Sprinkler extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler(){
        System.out.println("doSprinkler()");
    }
}
