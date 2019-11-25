package cn.yydcyy.design._3behaviour._9Strategy;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 设计一个鸭子，它可以动态地改变叫声。这里的算法族是鸭子的叫声行为。
 *
 * QuackBehavior 抽象类, 定义叫声 quack() 方法.
 * Squack / Quack 为 QuackBehavior 实现类[implements]
 * Duck 鸭子类, 定义 quackBehavior 成员属性 [抽象类]仅有 setter(), performQuack成员方法.
 *
 * Client 测试类
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squack());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
