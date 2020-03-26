package interpreter.demo1;

import java.util.HashMap;

/**
 * @Classname AddExpression
 * @Description TODO
 * @Date 2020/3/25 17:23
 * @Author Danrbo
 */

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 两者相加
     * @param var 存储变量名和对应的值
     * @return 相加的结果
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.getLeft().interpret(var) + super.getRight().interpret(var);
    }
}
