package cn.yydcyy.design._3behaviour._3Interpreter;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class OrExpression extends Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    // 初始化构造参数
    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String str) {
        return expression1.interpret(str) || expression2.interpret(str);
    }
}
