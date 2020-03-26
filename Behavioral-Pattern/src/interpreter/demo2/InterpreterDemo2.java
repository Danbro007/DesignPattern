package interpreter.demo2;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @Classname InterpreterDemo2
 * @Description TODO
 * @Date 2020/3/25 18:39
 * @Author Danrbo
 */
public class InterpreterDemo2 {
    public static void main(String[] args) {

        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("1 * 2 - 3");
        int value = (int) expression.getValue();
        System.out.println(value);
    }
}
