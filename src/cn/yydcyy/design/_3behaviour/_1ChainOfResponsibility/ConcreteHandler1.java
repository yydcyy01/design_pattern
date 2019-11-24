package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteHandler1 extends Handler{
    public ConcreteHandler1(Handler successor){
        super(successor);
    }
    @Override
    protected void handleRequest(Request request) {

    }
}
