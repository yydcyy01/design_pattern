package cn.yydcyy.design._3behaviour._10TemplateMethod;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    // protected abstract void pourInCup(){ 这样写实现类报错
    void pourInCup(){
        System.out.println("pourInCup");
    }

    void boilWater(){
        System.out.println("boilWater");
    }


}
