package interpreter.demo1;

import java.util.HashMap;

/**
 * @Classname AddExpression
 * @Description TODO
 * @Date 2020/3/25 17:23
 * @Author Danrbo
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.getLeft().interpret(var) + super.getRight().interpret(var);
    }
}
