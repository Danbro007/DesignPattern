package interpreter.demo1;

/**
 * @Classname Calculator
 * @Description TODO
 * @Date 2020/3/25 17:30
 * @Author Danrbo
 */

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算器类
 */
public class Calculator {
    private char[] chars;
    private Expression expression;

    public Calculator(String str) {
        this.chars = str.toCharArray();
        Stack<Expression> stack = new Stack<>();
        Expression left;
        Expression right;
        Expression result;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            switch (ch) {
                case '+': {
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    result = new AddExpression(left, right);
                    stack.push(result);
                    break;
                }
                case '-': {
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    result = new SubExpression(left, right);
                    stack.push(result);
                    break;
                }
                default: {
                    stack.push(new VarExpression(String.valueOf(ch)));
                    break;
                }
            }
        }
        expression = stack.pop();
    }

    /**
     * 先前的Calculator构造器就是通过判断符号来确定是用什么符号的表达式然后压入栈内
     * 最后弹出的是层层嵌套的Expression的对象
     * 执行run方法实际是递归调用Expression对象的interpret方法
     * 例如：expression.left = expression1    expression.right = expression2
     * expression1.left = expression3      expression1.right = expression4
     * expression.interpret(vat)则是通过var找到 left 和 right 对应的值,递归计算
     * @param var 存储变量名名和对应的值
     * @return 计算结果
     */
    public int run(HashMap<String,Integer> var){
        return expression.interpret(var);
    }
}
