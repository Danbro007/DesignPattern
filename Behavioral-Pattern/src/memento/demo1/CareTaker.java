package memento.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CareTaker
 * @Description TODO
 * @Date 2020/3/25 14:11
 * @Author Danrbo
 */
public class CareTaker {
    private List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    public void saveMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        if (mementoList.get(index) != null) {
            return mementoList.get(index);
        }
        return null;
    }
}
