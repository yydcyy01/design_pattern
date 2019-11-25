package cn.yydcyy.design._3behaviour._11Visitor;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public interface Element {
    void accept (Visitor visitor);
}
