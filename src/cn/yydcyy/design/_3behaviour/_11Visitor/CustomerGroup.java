package cn.yydcyy.design._3behaviour._11Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor){
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void accCustomer(Customer customer){
        customers.add(customer);
    }
}
