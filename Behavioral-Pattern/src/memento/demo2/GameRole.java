package memento.demo2;

/**
 * @Classname GameRole
 * @Description TODO
 * @Date 2020/3/25 14:34
 * @Author Danrbo
 */

import lombok.Data;

/**
 * 游戏角色类
 */
@Data
public class GameRole {

    private int atk;
    private int def;

    public GameRole(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    public Memento saveRoleMemento(){
        return new Memento(atk,def);
    }
    public void recoverRoleFromMemento(Memento memento){
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "atk=" + atk +
                ", def=" + def +
                '}';
    }
}
