package cn.yydcyy.design._3behaviour._12Null;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Client {
    public static void main(String[] args) {
        AbstractOperation abstractOperation = func(-1);
    }

    private static AbstractOperation func(int para) {
        if (para < 0)
            return new NullOperation();
        else
            return new RealOperation();
    }
}
