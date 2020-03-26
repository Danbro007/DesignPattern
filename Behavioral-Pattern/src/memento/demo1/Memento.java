package memento.demo1;

import lombok.Data;

/**
 * @Classname Memento
 * @Description TODO
 * @Date 2020/3/25 14:10
 * @Author Danrbo
 */

/**
 * 备份类
 */
@Data
public class Memento {
    /**
     * 状态
     */
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
