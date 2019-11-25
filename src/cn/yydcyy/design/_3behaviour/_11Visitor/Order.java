package cn.yydcyy.design._3behaviour._11Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Order implements Element{
    private String name;
    private List<Item> items = new ArrayList();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Item item : items){
            item.accept(visitor);
        }
    }

    public String getName() {
        return name;
    }

    void addItem(Item item){
        items.add(item);
    }
}
