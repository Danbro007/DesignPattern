package strategy.demo1;

/**
 * @Classname Duck
 * @Description TODO
 * @Date 2020/3/26 20:28
 * @Author Danrbo
 */
public abstract class Duck {
    abstract void display();
    public void swim(){
        System.out.println("鸭子在游泳！");
    }
    public void fly(){
        System.out.println("鸭子在飞！");
    }
    public void quack(){
        System.out.println("鸭子在叫！");
    }
}
