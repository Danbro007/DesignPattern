package interpreter.demo1;

import java.util.HashMap;

/**
 * @Classname Expression
 * @Description TODO
 * @Date 2020/3/25 17:18
 * @Author Danrbo
 */

/**
 * 表达式的抽象类
 */
public abstract class Expression {
    public abstract int interpret(HashMap<String, Integer> var);
}
