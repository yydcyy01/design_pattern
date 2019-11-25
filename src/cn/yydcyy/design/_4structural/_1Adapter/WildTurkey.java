package cn.yydcyy.design._4structural._1Adapter;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
