package mediater.demo1;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/3/24 15:03
 * @Author Danrbo
 */

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建中介
        ConcreteMediator concreteMediator = new ConcreteMediator();
        //创建各种电器
        Alarm alarm = new Alarm("闹钟", concreteMediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine("咖啡机", concreteMediator);
        Tv tv = new Tv("电视机", concreteMediator);
        Light light = new Light("电灯", concreteMediator);
        //闹钟发开启信号 执行规定的操作逻辑
        //闹钟先启动--->电视打开---->咖啡机启动---->电灯打开----->咖啡机关闭----->电视关闭
        alarm.sendAlarm(0);
    }
}
