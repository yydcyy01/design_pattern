package cn.yydcyy.design._3behaviour._9Strategy;

/**
 * @author YYDCYY
 * @create 2019-11-25

 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack ! ");
    }
}
