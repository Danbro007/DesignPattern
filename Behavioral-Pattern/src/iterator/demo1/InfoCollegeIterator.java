package iterator.demo1;

import java.util.Iterator;
import java.util.List;

/**
 * @Classname InfoCollegeIterator
 * @Description TODO
 * @Date 2020/3/23 19:59
 * @Author Danrbo
 */

/**
 * 信息学院迭代器
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> departmentList;
    private int index;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() || departmentList.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index++);
    }

    @Override
    public void remove() {

    }
}
