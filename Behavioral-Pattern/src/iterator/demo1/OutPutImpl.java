package iterator.demo1;

import java.util.Iterator;
import java.util.List;

/**
 * @Classname OutPutImpl
 * @Description TODO
 * @Date 2020/3/23 20:17
 * @Author Danrbo
 */

/**
 * 遍历打印
 */
public class OutPutImpl {
    List<College> collegeList;


    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 遍历collegeList,打印学院名，然后用迭代器遍历学院下面的所有专业。
     */
    public void show(){
        Iterator<College> collegeIterator = collegeList.iterator();
        while (collegeIterator.hasNext()){
            College college = collegeIterator.next();
            System.out.println(college.getName());
            Iterator iterator = college.createIterator();
            while (iterator.hasNext()){
                Object next = iterator.next();
                System.out.println(next);
            }
        }
    }
}
