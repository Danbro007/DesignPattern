package mediater.demo1;

/**
 * @Classname CoffeeMachine
 * @Description TODO
 * @Date 2020/3/24 16:15
 * @Author Danrbo
 */

/**
 * 咖啡机类
 */
public class CoffeeMachine extends ElectricAppliance {
    public CoffeeMachine(String name, Mediator mediator) {
        super(name, mediator);
        this.getMediator().register(name, this);
    }

    @Override
    public void sendMessage(int changeState, String name) {
        this.getMediator().getMessage(changeState, name);
    }


    public void sendCoffeeMachine(int changeState) {
        sendMessage(changeState, this.getName());
    }

    @Override
    public void start() {
        System.out.println("咖啡机启动！");
        this.sendCoffeeMachine(0);
    }

    @Override
    public void stop() {
        System.out.println("咖啡机停止！");
        this.sendCoffeeMachine(1);
    }


}
