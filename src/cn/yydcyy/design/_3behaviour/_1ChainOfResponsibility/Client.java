package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {


    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        handler2.handleRequest(request1);

        Request request2 = new Request(RequestType.TYPE2, "request2");
        handler2.handleRequest(request2);

    }
}
