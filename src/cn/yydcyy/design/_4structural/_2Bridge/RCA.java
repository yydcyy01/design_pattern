package cn.yydcyy.design._4structural._2Bridge;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class RCA extends TV {
    @Override
    public void on() {
        System.out.println("RCA.on()");
    }

    @Override
    public void off() {
        System.out.println("RCA.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("RCA.tuneChannel()");
    }
}
