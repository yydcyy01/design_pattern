package cn.yydcyy.design._4structural._3Composite;

/**
 * @author YYDCYY
 * @create 2019-11-25
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i ++){
            System.out.print("--");
        }
        System.out.println("left : " + name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
        // 牺牲透明性换取单一职责原则, 就不用考虑是叶子节点还是组合节点了.
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
