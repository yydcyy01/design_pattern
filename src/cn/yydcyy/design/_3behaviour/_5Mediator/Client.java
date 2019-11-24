package cn.yydcyy.design._3behaviour._5Mediator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);

        //
        alarm.onEvent(mediator);
    }
}
