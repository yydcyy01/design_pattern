package cn.yydcyy.design._3behaviour._7Observer;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class CurrentConditionsDisplay implements Observer {

    //构造器
    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrenConditionsDisplay.update: " + temp + "  " + humidity + " " + pressure);
    }
}
