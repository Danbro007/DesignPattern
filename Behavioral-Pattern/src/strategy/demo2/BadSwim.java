package strategy.demo2;

/**
 * @Classname BadSwim
 * @Description TODO
 * @Date 2020/3/26 20:51
 * @Author Danrbo
 */
public class BadSwim implements SwimAction {
    @Override
    public void swim() {
        System.out.println("游得差");
    }
}
