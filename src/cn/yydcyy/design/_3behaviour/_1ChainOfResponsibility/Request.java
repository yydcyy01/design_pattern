package cn.yydcyy.design._3behaviour._1ChainOfResponsibility;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Request {
    private RequestType type;
    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }


}
