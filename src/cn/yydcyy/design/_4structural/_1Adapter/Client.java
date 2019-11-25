package cn.yydcyy.design._4structural._1Adapter;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 还是火鸡, 只是可以调用鸭子的 duck 方法. gobble!
 */
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
