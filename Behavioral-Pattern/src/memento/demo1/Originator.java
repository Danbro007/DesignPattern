package memento.demo1;

import lombok.Data;

/**
 * @Classname Originator
 * @Description TODO
 * @Date 2020/3/25 14:09
 * @Author Danrbo
 */
@Data
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento saveStateMemento() {
        return new Memento(state);
    }

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
