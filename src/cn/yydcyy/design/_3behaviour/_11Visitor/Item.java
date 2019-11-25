package cn.yydcyy.design._3behaviour._11Visitor;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Item implements Element{
    private String name;




    public String getName() {
        return name;
    }

    public Item(String name) {
        this.name = name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
