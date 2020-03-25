package memento.demo1;

import lombok.Data;

/**
 * @Classname Memento
 * @Description TODO
 * @Date 2020/3/25 14:10
 * @Author Danrbo
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
