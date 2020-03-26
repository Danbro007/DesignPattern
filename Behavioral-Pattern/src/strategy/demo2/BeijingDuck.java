package strategy.demo2;

/**
 * @Classname BeijingDuck
 * @Description TODO
 * @Date 2020/3/26 20:31
 * @Author Danrbo
 */

public class BeijingDuck extends Duck {
    public BeijingDuck() {
        this.setFlyAction(new BadFly());
        this.setSwimAction(new BadSwim());
    }

    @Override
    void display() {
        System.out.println("这是北京鸭！");
    }
}
