package strategy.demo1;

/**
 * @Classname ToyDuck
 * @Description TODO
 * @Date 2020/3/26 20:32
 * @Author Danrbo
 */
public class ToyDuck extends Duck{
    @Override
    void display() {
        System.out.println("这是玩具鸭！");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳！");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞！");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫！");
    }
}
