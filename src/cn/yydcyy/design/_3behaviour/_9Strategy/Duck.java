package cn.yydcyy.design._3behaviour._9Strategy;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Duck {
    private QuackBehavior quackBehavior; //接口类


    // 展现叫声.
    public void performQuack(){

        //为空不处理
        //不为空则展现叫声
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
