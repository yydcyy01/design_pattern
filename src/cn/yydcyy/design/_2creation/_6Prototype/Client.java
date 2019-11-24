package cn.yydcyy.design._2creation._6Prototype;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
