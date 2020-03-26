package strategy.demo2;

/**
 * @Classname ToyDuck
 * @Description TODO
 * @Date 2020/3/26 20:32
 * @Author Danrbo
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        this.setFlyAction(new NoFly());
        this.setSwimAction(new NoSwim());
    }

    @Override
    void display() {
        System.out.println("这是玩具鸭！");
    }
}
