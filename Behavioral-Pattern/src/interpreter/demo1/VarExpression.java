package interpreter.demo1;

import java.util.HashMap;

/**
 * @Classname VarExpression
 * @Description TODO
 * @Date 2020/3/25 17:20
 * @Author Danrbo
 */

/**
 * 变量解释器
 */
public class VarExpression extends Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 通过key找到存储在var中的对应的值
     * @param var 存储变量和对应的值
     * @return 变量对应的值
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
