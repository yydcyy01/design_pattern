package cn.yydcyy.design._3behaviour._3Interpreter;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Client {

    public static Expression buildInterpreterTree(){
        // Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");

        // B C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // A Or ( B C )
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        // D and (A Or ( B C ))
        Expression alternation3 = new AndExpression(terminal4, alternation2);

        return alternation3;
    }

    /**
     * 以下是一个规则检验器实现，具有 and 和 or 规则，通过规则可以构建一颗解析树，用来检验一个文本是否满足解析树定义的规则。
     *
     * 例如一颗解析树为 D And (A Or (B C))，文本 "D A" 满足该解析树定义的规则。
     *
     * 这里的 Context 指的是 String。
     * @param args
     */
    public static void main(String[] args) {
        Expression define = buildInterpreterTree();
        String context1 = "D A"; //true
        String context2 = "D A B"; //true
        //String context3 = "D B C"; //true
       // String context4 = "D A B C"; // true
        //String context3 = "A B";
        String context3 = "D A C"; //true
        String context4 = "A"; //false
        String context5 = "B C"; //false
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));
        System.out.println(define.interpret(context3));
        System.out.println(define.interpret(context4));
        System.out.println(define.interpret(context5));

        //B C 默认执行 and 和 or ,  即 结果 B / C  / BC / null  才能解释上面结果
    }
}
