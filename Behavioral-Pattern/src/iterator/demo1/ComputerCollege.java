package iterator.demo1;

import java.util.Iterator;

/**
 * @Classname ComputerCollege
 * @Description TODO
 * @Date 2020/3/23 20:03
 * @Author Danrbo
 */

/**
 * 计算机学院类
 */
public class ComputerCollege implements College {
    private Department[] departments;
    private int departmentNum = 0;


    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("大数据专业");
        addDepartment("前端专业");
        addDepartment("运维专业");
        addDepartment("后端开发专业");
        addDepartment("云计算专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments[departmentNum++] = department;
    }

    /**
     * 返回计算机学院迭代器
     * @return 计算机学院迭代器
     */
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(this.departments);
    }
}
