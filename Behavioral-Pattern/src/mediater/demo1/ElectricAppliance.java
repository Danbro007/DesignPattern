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
    /**
     * 电器名
     */
    private String name;
    /**
     * 中介者
     */
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

    /**
     * 获取中介实例对象
     * @return 中介实例对象
     */
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
