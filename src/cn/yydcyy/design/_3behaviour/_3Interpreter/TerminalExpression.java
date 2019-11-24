package cn.yydcyy.design._3behaviour._3Interpreter;

import java.util.StringTokenizer;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class TerminalExpression extends Expression{

    private String literal = null;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
