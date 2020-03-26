package memento.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CareTaker
 * @Description TODO
 * @Date 2020/3/25 14:11
 * @Author Danrbo
 */

/**
 * 守护者类
 */
public class CareTaker {
    /**
     * 存放备份对象的list
     */
    private List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    /**
     * 把备份对象存储到 mementoList 里
     * @param memento 备份对象
     */
    public void saveMemento(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 通过索引从 mementoList 里获取备份对象
     * @param index 索引值
     * @return 备份对象
     */
    public Memento getMemento(int index) {
        if (mementoList.get(index) != null) {
            return mementoList.get(index);
        }
        return null;
    }
}
