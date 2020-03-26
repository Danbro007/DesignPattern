package interpreter.demo1;

/**
 * @Classname Client
 * @Description TODO 解释器模式
 * @Date 2020/3/25 17:17
 * @Author Danrbo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpression();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        int res = calculator.run(var);
        System.out.println("结果为：" + res);
    }

    /**
     * 把输入的表达式打印到控制台，并返回。
     * @return 输入的表达式
     * @throws IOException
     */
    public static String getExpression() throws IOException {
        System.out.println("请输入表达式:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    /**
     * 获取变量名对应的值的map
     * @param expStr 表达式
     * @return 变量名和对应的值的map
     * @throws IOException
     */
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>(16);
        char[] charArray = expStr.toCharArray();
        String key;
        Integer value;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch != '+' && ch != '-') {
                key = String.valueOf(charArray[i]);
                System.out.println(key + ":");
                value = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                map.put(key,value);
            }
        }
        return map;
    }
}
