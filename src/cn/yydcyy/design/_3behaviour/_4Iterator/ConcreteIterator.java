package cn.yydcyy.design._3behaviour._4Iterator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteIterator<Item> implements Iterator<Item>{

    private Item[] items;
    private int position = 0;

    // 构造函数
    public ConcreteIterator(Item[] items) {
        this.items = items;
    }


    @Override
    public Item next() {
        return items[position ++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
