package cn.yydcyy.design._3behaviour._4Iterator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
