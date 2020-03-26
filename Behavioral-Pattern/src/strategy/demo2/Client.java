package strategy.demo2;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/3/26 20:56
 * @Author Danrbo
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        wildDuck.swim();
        System.out.println("--------------------------");
        BeijingDuck beijingDuck = new BeijingDuck();
        beijingDuck.display();
        beijingDuck.fly();
        beijingDuck.swim();
        System.out.println("--------------------------");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.swim();
    }
}
