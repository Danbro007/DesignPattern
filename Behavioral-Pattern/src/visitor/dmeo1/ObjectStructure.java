package visitor.dmeo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ObjectStructure
 * @Description TODO
 * @Date 2020/3/23 15:17
 * @Author Danrbo
 */

/**
 * 数据结构
 */
public class ObjectStructure {
    /**
     * 存储人（男人和女人）
     */
    private List<Person> personList = new ArrayList<>();

    /**
     * 添加人
     *
     * @param person 人
     */
    public void add(Person person) {
        personList.add(person);
    }

    /**
     * 展示不同人对状况的反应
     *
     * @param situation 状况
     */
    public void show(Situation situation) {
        for (Person person : personList) {
            person.accept(situation);
        }
    }
}
