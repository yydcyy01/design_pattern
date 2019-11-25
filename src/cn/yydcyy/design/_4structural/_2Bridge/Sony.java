package cn.yydcyy.design._4structural._2Bridge;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Sony extends TV {

    /**
     * 开电视
     */
    @Override
    public void on() {
        System.out.println("Sony.on()");
    }

    /**
     * 关电视
     */
    @Override
    public  void off() {
        System.out.println("Sony.off()");
    }

    /**
     * 换台
     */
    @Override
    public void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
