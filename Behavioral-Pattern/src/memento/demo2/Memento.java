package memento.demo2;

/**
 * @Classname Memento
 * @Description TODO
 * @Date 2020/3/25 14:35
 * @Author Danrbo
 */

import lombok.Data;

/**
 * 备份类
 */
@Data
public class Memento {

    private int atk;
    private int def;

    public Memento(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }
}
