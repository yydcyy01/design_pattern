package cn.yydcyy.design._4structural._2Bridge;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public abstract class RemoteControl {
    protected TV tv;

    //构造器
    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel();
}
