package cn.yydcyy.design._2creation._2SimpleFactory;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {

    /**
     * 以下的 Client 类包含了实例化的代码，这是一种错误的实现。如果在客户类中存在这种实例化代码，就需要考虑将代码放到简单工厂中。
     * @param args
     */
    /*public static void main(String[] args) {
        int type = 1;
        Product product;
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2){
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct();
        }
        // do something with the product
    }*/


    public static void main(String[] args) {

        //解耦 , 创建交给 simpleFactory
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        //do something with the product
    }
}
