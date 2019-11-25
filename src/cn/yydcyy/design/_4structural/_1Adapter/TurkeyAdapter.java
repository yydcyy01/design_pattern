package cn.yydcyy.design._4structural._1Adapter;

/**
 * @author YYDCYY
 * @create 2019-11-25
 * 火鸡适配器
 * 让火鸡冒充鸭子
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // 构造器
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     *
     */
    @Override
    public void quack() {
        turkey.gobble();
    }
}
