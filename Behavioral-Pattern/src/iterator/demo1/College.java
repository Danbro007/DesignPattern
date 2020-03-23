package iterator.demo1;

import java.util.Iterator;

/**
 * @Classname College
 * @Description TODO
 * @Date 2020/3/23 20:02
 * @Author Danrbo
 */

/**
 * 学院接口
 */
public interface College {
    /**
     * 获取学院名
     *
     * @return 学院名
     */
    String getName();

    /**
     * 添加专业
     *
     * @param name 专业名
     */
    void addDepartment(String name);

    /**
     * 创建迭代器
     *
     * @return 迭代器
     */
    Iterator createIterator();
}
