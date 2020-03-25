package mediater.demo1;

/**
 * @Classname Alarm
 * @Description TODO
 * @Date 2020/3/24 16:13
 * @Author Danrbo
 */

/**
 * 闹钟类
 */
public class Alarm extends ElectricAppliance {

    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        this.getMediator().register(name, this);
    }

    @Override
    public void sendMessage(int changeState, String name) {
        this.getMediator().getMessage(changeState,name);
    }

    public void sendAlarm(int changeState) {
        sendMessage(changeState, this.getName());
    }

    @Override
    public void start() {
        System.out.println("闹钟响了！");
    }

    @Override
    public void stop() {
        System.out.println("闹钟停了！");
    }
}
