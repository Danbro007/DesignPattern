package interpreter.demo1;

/**
 * @Classname SymbolExpression
 * @Description TODO
 * @Date 2020/3/25 17:21
 * @Author Danrbo
 */

import lombok.Data;

import java.util.HashMap;

/**
 * 符号解释器
 */
@Data
public class SymbolExpression extends Expression {
    private Expression left;
    private Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 空方法
     * @param var 存储变量名和对应的值
     * @return 变量名对应的值
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return 0;
    }
}
