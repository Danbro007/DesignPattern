package strategy.demo2;

/**
 * @Classname GoodSwim
 * @Description TODO
 * @Date 2020/3/26 20:50
 * @Author Danrbo
 */
public class GoodSwim implements SwimAction {
    @Override
    public void swim() {
        System.out.println("游得好");
    }
}
