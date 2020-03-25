package mediater.demo1;

/**
 * @Classname Tv
 * @Description TODO
 * @Date 2020/3/24 16:15
 * @Author Danrbo
 */

/**
 * 电视类
 */
public class Tv extends ElectricAppliance {
    public Tv(String name, Mediator mediator) {
        super(name, mediator);
        this.getMediator().register(name, this);
    }

    @Override
    public void sendMessage(int changeState, String name) {
        this.getMediator().getMessage(changeState, name);
    }

    public void sendTv(int changeState) {
        sendMessage(changeState, this.getName());
    }

    @Override
    public void start() {
        System.out.println("电视机打开！");
        this.sendTv(0);
    }

    @Override
    public void stop() {
        System.out.println("电视机关闭！");
    }
}
