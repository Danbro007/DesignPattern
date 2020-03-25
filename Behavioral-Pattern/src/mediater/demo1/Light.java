package mediater.demo1;

/**
 * @Classname Light
 * @Description TODO
 * @Date 2020/3/24 20:13
 * @Author Danrbo
 */

/**
 * 电灯类
 */
public class Light extends ElectricAppliance {
    public Light(String name, Mediator mediator) {
        super(name, mediator);
        this.getMediator().register(name, this);
    }

    @Override
    public void sendMessage(int changeState, String name) {
        this.getMediator().getMessage(changeState,name);
    }

    public void sendLight(int changeState){
        sendMessage(changeState,this.getName());
    }

    @Override
    public void start() {
        System.out.println("电灯打开！");
        this.sendLight(0);
    }

    @Override
    public void stop() {
        System.out.println("电灯关闭！");
    }
}
