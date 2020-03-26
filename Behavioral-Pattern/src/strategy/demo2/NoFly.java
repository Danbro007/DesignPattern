package strategy.demo2;

/**
 * @Classname NoFly
 * @Description TODO
 * @Date 2020/3/26 20:48
 * @Author Danrbo
 */
public class NoFly implements FlyAction {
    @Override
    public void fly() {
        System.out.println("不会飞！");
    }
}
