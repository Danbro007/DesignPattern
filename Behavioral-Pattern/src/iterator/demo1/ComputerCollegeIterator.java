package iterator.demo1;

import java.util.Iterator;

/**
 * @Classname ComputerCollegeIterator
 * @Description TODO
 * @Date 2020/3/23 19:54
 * @Author Danrbo
 */

/**
 * 计算机学院迭代器
 */
public class ComputerCollegeIterator implements Iterator {
    private Department[] departments;
    private int index;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }

    @Override
    public void remove() {

    }
}
