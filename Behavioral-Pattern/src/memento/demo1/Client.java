package memento.demo1;

/**
 * @Classname Client
 * @Description TODO 备忘录模式
 * @Date 2020/3/25 14:06
 * @Author Danrbo
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("状态1");
        System.out.println("现在的状态："+ originator.getState());
        CareTaker careTaker = new CareTaker();
        Memento memento = originator.saveStateMemento();
        careTaker.saveMemento(memento);
        System.out.println("改变originator状态");
        originator.setState("改变状态1");
        System.out.println("现在的状态："+ originator.getState());
        System.out.println("恢复originator状态");
        originator.getStateMemento(careTaker.getMemento(0));
        System.out.println("现在的状态：" + originator.getState());
    }
}
