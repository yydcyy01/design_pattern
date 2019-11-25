package cn.yydcyy.design._4structural._5Facade;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class SubSystem {
    public void turnOnTv(){
        System.out.println("turnOnTV");
    }

    public void setCD(String cd){
        System.out.println("setCD( " + cd +  " )");
    }

    public void startWatching(){
        System.out.println("startWatching()");
    }
}
