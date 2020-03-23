package iterator.demo1;

/**
 * @Classname Department
 * @Description TODO
 * @Date 2020/3/23 19:55
 * @Author Danrbo
 */

/**
 * 专业类
 */
public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "专业名：'" + name + '\'';
    }
}
