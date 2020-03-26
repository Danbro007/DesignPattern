package strategy.demo2;

import lombok.Data;

/**
 * @Classname Duck
 * @Description TODO
 * @Date 2020/3/26 20:28
 * @Author Danrbo
 */
@Data
public abstract class Duck {
    private FlyAction flyAction;
    private SwimAction swimAction;

    abstract void display();

    public void swim() {
       if (swimAction != null){
           swimAction.swim();
       }
    }

    public void fly() {
        if (flyAction != null) {
            flyAction.fly();
        }
    }
}
