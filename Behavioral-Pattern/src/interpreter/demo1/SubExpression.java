package interpreter.demo1;

import java.util.HashMap;

/**
 * @Classname SubExpression
 * @Description TODO
 * @Date 2020/3/25 17:29
 * @Author Danrbo
 */

/**
 *减法解释器
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 两者相减
     * @param var 存储变量名和对应的值
     * @return 相减的结果
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.getLeft().interpret(var) - super.getRight().interpret(var);
    }
}
