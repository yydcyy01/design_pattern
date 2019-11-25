package cn.yydcyy.design._3behaviour._11Visitor;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public interface Visitor {
    void visit(Customer customer);
    void visit(Order order);
    void visit(Item item);
}
