package cn.yydcyy.design._3behaviour._10TemplateMethod;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }

    @Override
    protected void brew() {
        System.out.println("Coffee.brew");
    }
}
