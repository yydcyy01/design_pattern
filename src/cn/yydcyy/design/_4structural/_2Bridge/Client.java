package cn.yydcyy.design._4structural._2Bridge;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new ConcreteRemoteControll(new RCA());
        remoteControl.on();
        remoteControl.off();
        remoteControl.tuneChannel();

        RemoteControl remoteControl2 = new ConcreteRemoteControll2(new Sony());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();
    }
}
