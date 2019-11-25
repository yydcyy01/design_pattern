package cn.yydcyy.design._3behaviour._10TemplateMethod;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Tea extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Tea.addCondiments");

    }

    @Override
    protected void brew() {
        System.out.println("Tea.brew");

    }
}
