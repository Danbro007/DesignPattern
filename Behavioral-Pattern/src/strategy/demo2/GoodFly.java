package strategy.demo2;

/**
 * @Classname GoodFly
 * @Description TODO
 * @Date 2020/3/26 20:47
 * @Author Danrbo
 */
public class GoodFly implements FlyAction {
    @Override
    public void fly() {
        System.out.println("飞得好");
    }
}

