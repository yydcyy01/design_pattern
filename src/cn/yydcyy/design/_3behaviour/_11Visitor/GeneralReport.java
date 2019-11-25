package cn.yydcyy.design._3behaviour._11Visitor;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class GeneralReport implements Visitor{
    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customersNo ++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        ordersNo ++;
    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
        ordersNo ++;
    }

    public void displayResults(){
        System.out.println("Number of customers : " + customersNo);
        System.out.println("Number of orders : " + ordersNo);
        System.out.println("Number of Items : " + itemsNo);
    }
}
