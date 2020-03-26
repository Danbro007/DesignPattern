package memento.demo1;

import lombok.Data;

/**
 * @Classname Originator
 * @Description TODO
 * @Date 2020/3/25 14:09
 * @Author Danrbo
 */

/**
 * 需要保存的对象
 */
@Data
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    /**
     *创建备份对象
     * @return 备份对象
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 把备份对象的值赋给本对象
     * @param memento 备份对象
     */
    public void getStateMemento(Memento memento){
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
