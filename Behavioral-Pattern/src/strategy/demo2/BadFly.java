package strategy.demo2;

/**
 * @Classname BadFly
 * @Description TODO
 * @Date 2020/3/26 20:48
 * @Author Danrbo
 */
public class BadFly implements FlyAction {
    @Override
    public void fly() {
        System.out.println("飞得差");
    }
}
