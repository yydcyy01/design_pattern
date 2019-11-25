package cn.yydcyy.design._3behaviour._7Observer;

import cn.yydcyy.design._3behaviour._7Observer.Observer;
import cn.yydcyy.design._3behaviour._7Observer.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-11-24
 *
 * 天气类,
 * 包含 :
 *   空参构造, 成员属性,setMeasurements, 增删通知方法,
 */
public class WeatherData implements Subject {


    private List<Observer> observers; //记录观察者 list 名单
    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure; // 气压



    // 空参构造器, 初始化
    public WeatherData() {
        observers = new ArrayList<>();
    }

    //更改后通知观察者
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserve(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }


    //遍历通知
    @Override
    public void notifyObserver() {
        for (Observer o : observers)
            o.update(temperature, humidity, pressure);
    }
}
