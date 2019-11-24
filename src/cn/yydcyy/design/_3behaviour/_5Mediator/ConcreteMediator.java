package cn.yydcyy.design._3behaviour._5Mediator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteMediator extends Mediator{

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calender calender;
    private Sprinkler sprinkler;

    //构造器
    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calender calender, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calender = calender;
        this.sprinkler = sprinkler;
    }



    @Override
    public void doEvent(String eventType) {
        switch (eventType){
            case "alarm" :
                doAlarmEvent();
                break;
            case "coffeePot" :
                doCoffeePotEvent();
                break;
            case "calender" :
                doCalenderEvent();
                break;
            default:
                doSprinklerEvent();
        }
    }

    public void doAlarmEvent(){
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doCoffeePotEvent(){
        // do something ...
    }

    public void doCalenderEvent(){
        // do something ...
    }

    public void doSprinklerEvent(){
        // do something ...
    }
}
