package cn.yydcyy.design._4structural._5Facade;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 感觉像 JavaWeb 中的 MVC 中的操作.  dao处理crud. service 层应用层. 前端调用 service 组合. 不用管内部实现
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
