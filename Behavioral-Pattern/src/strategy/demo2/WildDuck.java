package strategy.demo2;

import lombok.Data;

/**
 * @Classname WildDuck
 * @Description TODO
 * @Date 2020/3/26 20:30
 * @Author Danrbo
 */
@Data
public class WildDuck extends Duck {
    public WildDuck() {
        this.setFlyAction(new GoodFly());
        this.setSwimAction(new GoodSwim());
    }

    @Override
    void display() {
        System.out.println("这是野鸭！");
    }
}
