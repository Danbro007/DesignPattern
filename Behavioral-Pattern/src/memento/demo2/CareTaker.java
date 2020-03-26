package memento.demo2;

/**
 * @Classname CareTaker
 * @Description TODO
 * @Date 2020/3/25 14:36
 * @Author Danrbo
 */

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 守护者类
 */
@Data
public class CareTaker {
    private List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    public void setMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
