package strategy.demo1;

/**
 * @Classname BeijingDuck
 * @Description TODO
 * @Date 2020/3/26 20:31
 * @Author Danrbo
 */
public class BeijingDuck extends Duck{
    @Override
    void display() {
        System.out.println("这是北京鸭！");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔！");
    }
}
