package iterator.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname InfoCollege
 * @Description TODO
 * @Date 2020/3/23 20:10
 * @Author Danrbo
 */

/**
 * 信息学院类
 */
public class InfoCollege implements College {
    private List<Department> departmentList;
    private int departmentNum = 0;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业");
        addDepartment("信息专业2");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name) {
        departmentList.add(departmentNum++, new Department(name));
    }

    /**
     * 返回信息学院迭代器
     * @return 信息学院迭代器
     */
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
