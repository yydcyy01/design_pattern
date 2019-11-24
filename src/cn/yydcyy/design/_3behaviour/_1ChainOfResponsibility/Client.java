package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
    }
}
