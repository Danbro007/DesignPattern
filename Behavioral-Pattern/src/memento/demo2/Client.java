package memento.demo2;

/**
 * @Classname Client
 * @Description TODO 备忘录模式2
 * @Date 2020/3/25 14:33
 * @Author Danrbo
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100, 200);
        CareTaker careTaker = new CareTaker();
        System.out.println("打BOSS前保存角色数据！");
        //保存角色数据
        Memento memento = gameRole.saveRoleMemento();
        careTaker.setMemento(memento);
        System.out.println("现在角色的数据：" + gameRole);
        System.out.println("打完BOSS");
        //修改角色数据
        gameRole.setAtk(50);
        gameRole.setDef(100);
        System.out.println("现在角色的数据：" + gameRole);
        System.out.println("恢复角色数据！");
        //恢复角色数据
        gameRole.recoverRoleFromMemento(careTaker.getMemento(0));
        System.out.println("现在角色的数据：" + gameRole);
    }
}
