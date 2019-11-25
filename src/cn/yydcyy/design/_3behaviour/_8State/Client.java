package cn.yydcyy.design._3behaviour._8State;

/**
 * @author YYDCYY
 * @create 2019-11-25
 *
 * 组成 :
 *  抽象类 Statu : 定义 四种通用方法 [ 投币, 退币, 转钮, 出货 ]
 *  四种状态类 : Sold / SoldOut / NoQuart / HasQuart/ [ 定义成员 machine, 集成 Statu 实现四种方法.  ]
 *  机器 Machine [ 定义四种状态成员及其 getter() + state 记录当前状态及其 setter()类 + count 记录机器库存 ]
 *  Client 客户端 进行测试
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("*****************************");

        //初始化售货机 : 5 个🍬
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println("*****************************");

        // 投币, 出货 测试 剩余 4 个🍬
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("*****************************");

        // 投币, 退币, 出货测试 剩余 4 个🍬
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println("*****************************");

        //投币, 出货, 投币, 出货, 退币 剩余 2 个🍬
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println("*****************************");

        //投币, 投币测试, 出货, 投币, 出货 剩余 0 个🍬
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("*****************************");


        //投币, 出货测试.  应该报错, 售空
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("*****************************");

    }
}
