package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor){
        this.successor = successor;
    }

    /**
     * 业务逻辑 : 对象连成一条链, 沿着链发送请求, 知道有一个对象处理它为止
     * @param request
     */
    protected abstract  void handleRequest(Request request);
}
