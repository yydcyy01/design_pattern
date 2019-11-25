package cn.yydcyy.design._4structural._2Bridge;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class ConcreteRemoteControll extends RemoteControl {
    //构造器
    public ConcreteRemoteControll(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControll.on()");
        //调用父类滴
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControll.off()");
        //调用父类滴
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControll.tuneChannel()");
        //调用父类滴
        tv.tuneChannel();
    }
}
