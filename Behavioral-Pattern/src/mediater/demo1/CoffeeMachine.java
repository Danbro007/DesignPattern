package mediater.demo1;

/**
 * @Classname CoffeeMachine
 * @Description TODO
 * @Date 2020/3/24 16:15
 * @Author Danrbo
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(String name, Mediator mediator) {
        super(name, mediator);
        this.getMediator().register(name, this);
    }


}
