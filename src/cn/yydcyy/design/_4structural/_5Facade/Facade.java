package cn.yydcyy.design._4structural._5Facade;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTv();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
