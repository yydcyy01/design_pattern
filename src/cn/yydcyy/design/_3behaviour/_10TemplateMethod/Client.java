package cn.yydcyy.design._3behaviour._10TemplateMethod;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 定义算法框架，并将一些步骤的实现延迟到子类。
 * 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 *
 * 例子中 冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。
 * CaffeineBeverage abstract 类定义了 四个方法  boilWater(); brew(); pourInCup();  addCondiments();
 * 其中 boilWater() 和 pourInCup() 两个方法是通用, 在 abstract中直接实现
 * brew(); addCondiments(); 定义成抽象类 "protected abstract void brew();" 留给对应类实现.
 *
 * 使用中, 创建统一对象 比如叫caffeineBeverage, 骚在caffeineBeverage 对象重复利用.  caffeineBeverage = new Coffee();  用完了继续 caffeineBeverage = new Tea();.  即通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 */
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();

        System.out.println("***********");

        // 模板方法 设计模式骚在这, 同一对象换算法
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
