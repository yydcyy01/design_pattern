package cn.yydcyy.design._3behaviour._11Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Customer implements Element{
    private String name;

    private List<Order> orders = new ArrayList<Order>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void addOrder(Order order){
        orders.add(order);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
