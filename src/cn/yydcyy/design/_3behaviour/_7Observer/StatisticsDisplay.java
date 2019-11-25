package cn.yydcyy.design._3behaviour._7Observer;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 观察者页面, 空参构造被加入到 weatherData 列表中, 若对应天气更新, 自己的 update 被调用[ 接收形参 ], 打印天气.
 */
public class StatisticsDisplay implements  Observer{

    // 天气列表注册 [ 被添加到 list 中 ]
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update : " + temp + " " + humidity + "  " + pressure);
    }
}
