package cn.yydcyy.design._3behaviour._4Iterator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteAggregate implements Aggregate {
    private Integer[] items;

    /**空参构造函数
         初始化
     */
    public ConcreteAggregate(){
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
