package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class ConcreteHandler2 extends Handler{
    //构造器
    public ConcreteHandler2(Handler successor){
        super(successor);
    }


    @Override
    protected void handleRequest(Request request) {

        // 枚举类型判断
        if (request.getType() == RequestType.TYPE2){
            System.out.println(request.getName() + " is handle by ConcreteHandler2 ");
            return;
        }

        if (successor != null){
            successor.handleRequest(request);
        }
        //不是上面类型且为空, 就不处理呗.
    }
}
