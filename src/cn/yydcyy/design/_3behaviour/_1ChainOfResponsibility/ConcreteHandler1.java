package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteHandler1 extends Handler{
    //构造器
    public ConcreteHandler1(Handler successor){
        super(successor);
    }


    @Override
    protected void handleRequest(Request request) {

        // 枚举类型判断
        if (request.getType() == RequestType.TYPE1){
            System.out.println(request.getName() + " is handle by ConcreteHandler1 ");
            return;
        }

        if (successor != null){
            successor.handleRequest(request);
        }
    }
}
