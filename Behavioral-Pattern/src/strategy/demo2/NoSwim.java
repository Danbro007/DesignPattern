package strategy.demo2;

/**
 * @Classname NoSwim
 * @Description TODO
 * @Date 2020/3/26 20:51
 * @Author Danrbo
 */
public class NoSwim implements SwimAction {
    @Override
    public void swim() {
        System.out.println("不会游泳！");
    }
}
