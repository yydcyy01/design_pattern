package cn.yydcyy.design._3behaviour._4Iterator;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public interface Iterator<Item> {
    Item next();
    boolean hasNext();
}
