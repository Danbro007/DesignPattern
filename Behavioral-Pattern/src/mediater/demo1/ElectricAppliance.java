package mediater.demo1;

import lombok.Data;

/**
 * @Classname ElectricAppliance
 * @Description TODO
 * @Date 2020/3/24 15:34
 * @Author Danrbo
 */

/**
 * 电器抽象类
 */
@Data
public abstract class ElectricAppliance {
    private String name;
    private Mediator mediator;

    public ElectricAppliance(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * 发送信号
     * @param changeState 信号状态
     * @param name 电器名
     */
    public abstract void sendMessage(int changeState, String name);

    public Mediator getMediator() {
        return this.mediator;
    }

    /**
     * 开启操作
     */
    public abstract void start();

    /**
     * 关闭操作
     */
    public abstract void stop();
}
