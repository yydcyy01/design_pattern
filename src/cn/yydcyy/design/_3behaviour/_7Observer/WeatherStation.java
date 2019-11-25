package cn.yydcyy.design._3behaviour._7Observer;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 测试类 , 显示结果
 *
 * 说明  :CurrentConditionsDisplay 和 StatisticsDisplay 相当于两个订阅者, 加入当前天气. 当天气发生改变[setMeasurements], 收到天气通知
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }
}
